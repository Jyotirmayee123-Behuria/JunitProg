import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class HemUpgifter {

    @RepeatedTest(20)
    @DisplayName("Testing how long the method is executing")
    void testTimeoutInc() {
        MyTest testObject = new MyTest();
        Assertions.assertTimeout(Duration.ofMillis(5),() -> testObject.printExample());
    }
}
