package edu.berkeley.path.next.TestDisruptor;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Bean;
import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;

public class TestConfiguration {

    private int NUMBER_OF_LINKS = 100;

    @Bean public RunTest runTest() {
        RunTest rt =  new RunTest();
        rt.NUMBER_OF_LINKS = NUMBER_OF_LINKS;
        return rt;
    }

    @Bean
    public Publisher publisher(){
        Publisher pub = new Publisher();
        pub.linkMgr = new LinkManager();

        return pub;
    }

    @Bean
    public Receiver receiver(){
        Receiver recv = new Receiver();
        recv.logger = LogManager.getLogger(TestOne.class.getName());
        return recv;
    }

    @Bean
    public CountDownLatch latch(){
        return new CountDownLatch(NUMBER_OF_LINKS);
    }

    @Bean
    Environment env() {
        return new Environment();
    }

    @Bean
    Reactor createReactor(Environment env) {
        return Reactors.reactor()
                .env(env)
                .dispatcher(Environment.THREAD_POOL)
                .get();
    }

}
