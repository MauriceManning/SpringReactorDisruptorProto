package edu.berkeley.path.next.TestDisruptor;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import reactor.event.Event;
import reactor.function.Consumer;


@Configuration
@ComponentScan
//@Service
public class Receiver implements Consumer<Event<LinkDataRaw>>  {

    @Autowired
    CountDownLatch latch;

    LinkDataRaw rl;
    protected Logger logger;

    public void accept(Event<LinkDataRaw> ev) {
        rl = (LinkDataRaw)ev.getData();
        //System.out.println("Link " + rl.getSpeedLimit() );
        logger.info("Link " + rl.getSpeedLimit());

        // this counts down the number of messages received so that we know that everything arrived as expected
        latch.countDown();
    }


}
