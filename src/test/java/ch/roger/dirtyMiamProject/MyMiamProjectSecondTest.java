
package ch.roger.dirtyMiamProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.function.Supplier;

@SpringBootTest
class MyMiamProjectSecondTest {

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