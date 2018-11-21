package tudelft.gettingstarted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GettingStartedTest {

    @Test
    void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        assertEquals(25, result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        assertEquals(5, result);
    }

    @Test
    void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        assertEquals(-15, result);
    }
}
