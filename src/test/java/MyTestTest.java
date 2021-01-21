import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyTestTest {

    @ParameterizedTest
    @ValueSource (strings = { "jhon", "jenny", "jerry", "joshef","jack" })
        void print(String names){
        String Expected=(names.toUpperCase());//Code under Test
        System.out.println(Expected);
        String actual = (names.toUpperCase());
        Assertions.assertEquals(Expected,actual);
    }
}