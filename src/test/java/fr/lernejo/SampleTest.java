package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();
    @Test
    void op_3_plus_2_is_5 () {
        int result = sample.op(Sample.Operation.ADD, 3, 2);
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void op_3_times_2_is_6(){
        int result = sample.op(Sample.Operation.MULT, 3, 2);
        Assertions.assertThat(result).isEqualTo(6);
    }


    @Test
    void fact_of_negative_number_throws() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void fact_of_x_is_y(){
        int result = sample.fact(5);
        Assertions.assertThat(result).isEqualTo(120);
    }
}
