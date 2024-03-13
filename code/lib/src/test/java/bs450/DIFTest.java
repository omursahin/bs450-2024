package bs450;

import org.junit.jupiter.api.Test;

import static bs450.DIF.countPositive;
import static bs450.DIF.findLast;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DIFTest {
    @Test
    public void findLast_failure() {
        int[] arr = {0};
        assertThat(findLast(arr, 0), equalTo(0));
    }

    @Test
    public void findLast_defectNotExecuted() {
        assertThrows(NullPointerException.class, () -> {
            findLast(null, 0);
        });
    }

    @Test
    public void findLast_defectExecuted_noInfection() {
        int[] arr = {0,1};
        int[] arr_2 = {};
        assertThat(findLast(arr,1), equalTo(1));
        assertThat(findLast(arr_2,1), equalTo(-1));
    }

    @Test
    public void findLast_defectExecuted_infectionCaused_noFailure(){
        int[] arr = {0,1};
        assertThat(findLast(arr,2), equalTo(-1));
    }

    @Test
    public void countPositive_failure() {
        int[] arr = {0};
        assertThat(countPositive(arr), equalTo(0));
    }

    @Test
    public void countPositive_defectNotExecuted() {
        int[] arr = {};
        assertThat(countPositive(arr), equalTo(0));
    }

    @Test
    public void countPositive_defectExecuted_noInfection() {
        int[] arr = {1};
        assertThat(countPositive(arr), equalTo(1));
    }
}
