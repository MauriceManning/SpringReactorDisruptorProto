package edu.berkeley.path.next.TestDisruptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reactor.core.Reactor;
import reactor.event.Event;
import static reactor.event.selector.Selectors.$;

@Configuration
@ComponentScan("edu.berkeley.path.next.TestDisruptor")

public class RunTest  {

    @Autowired
    private Reactor rbReactor;
    @Autowired
    private Publisher publisher;
    @Autowired
    private Receiver receiver;

    // number of links to publish to the reactor
    protected int NUMBER_OF_LINKS;

    @Bean
    public void run() throws Exception {
        final Logger logger = LogManager.getLogger(TestOne.class.getName());
        logger.info("start runTest. ");

        // Subscribe to topic
        // set the receiver class as the callback when an event or message arrives.
        rbReactor.on($("topic"), receiver);

        // Call the publisher to push the links to the reactor
        publisher.publishLinks(NUMBER_OF_LINKS);

    }

}
