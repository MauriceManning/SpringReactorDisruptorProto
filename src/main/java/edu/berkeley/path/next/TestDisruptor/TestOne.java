package edu.berkeley.path.next.TestDisruptor;

import static reactor.event.selector.Selectors.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;
import reactor.event.Event;
import reactor.event.selector.Selector;
import reactor.function.Consumer;
import reactor.spring.context.config.EnableReactor;
import reactor.function.support.Boundary;
//import reactor.spring.context.config.EnableReactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@Configuration
@ComponentScan("edu.berkeley.path.next.TestDisruptor")
public class TestOne  {

    @Autowired
    static private RunTest      runTest;

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(TestConfiguration.class);
        ctx.refresh();

        final Logger logger = LogManager.getLogger(TestOne.class.getName());
        logger.info("start test. ");

        RunTest runTest = ctx.getBean(RunTest.class);

        runTest.run();

    }


}
