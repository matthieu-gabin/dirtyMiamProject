package ch.roger.dirtyMiamProject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

@Configuration
class TestConfig {
    private final AtomicLong countMiam = new AtomicLong(0);

    // No additional configuration needed for this test class
    @Bean
    public Supplier<Long> miam() {
        return countMiam::incrementAndGet;
    }
}