package edu.berkeley.path.next.TestDisruptor;

import java.util.concurrent.CountDownLatch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reactor.core.Reactor;
import reactor.event.Event;

@Configuration
//@ComponentScan
@Import(Reactor.class)
public class Publisher {

    @Autowired
    private Reactor rbReactor;
    @Autowired
    CountDownLatch latch;

    protected  LinkManager linkMgr;

    public void publishLinks(int numberOfLinks) throws InterruptedException {

        long start = System.currentTimeMillis();

        // create one Link and wrap it in an event so it is ready to publish to Reactor
        LinkDataRaw link = linkMgr.getLink();
        System.out.println("link getSpeedLimit: " + link.getSpeedLimit() + "mph");
        Event msg = Event.wrap(link);

        for (int i=0; i < numberOfLinks; i++) {
            //System.out.println("sending link ");
            rbReactor.notify("topic", msg);
        }

        //Use the latch if you want the publisher to wait until the receiver "gets" all messages before exiting
        //latch.await();

        //publish the amount of time required to push all the link objects to the Reactor
        //if latch is used then this time also include the amount of time for the receiver to process all the incoming messages
        long elapsed = System.currentTimeMillis()-start;

        System.out.println("publishLinks Elapsed time: " + elapsed + "ms");

    }

}
