
package ch.roger.dirtyMiamProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

@SpringBootTest
@ActiveProfiles("SUPERMIAM")
class MySuperMiamProjectTest {

    @Autowired
    private Supplier<Long> miam;

    @Test
    void testXMiamThreeTime() throws Exception {

        miam.get();
        miam.get();
        Assertions.assertThat(miam.get()).isEqualTo(3);
    }


    @Test
    void testIIMiamTwoTime() throws Exception {

        miam.get();
        Assertions.assertThat(miam.get()).isEqualTo(5);
    }

}