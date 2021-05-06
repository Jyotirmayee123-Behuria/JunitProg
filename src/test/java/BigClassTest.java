import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BigClassTest {
    @ParameterizedTest
    @CsvSource({"2,5,7", "3,4,7", "7,4,11"})
    void testAdd(int a,int b,int expected) {
        System.out.println(expected);
        BigClass B = new BigClass();
        int Actual = B.add(a,b);
        Assertions.assertEquals(expected ,Actual);
    }
    @Test
    void testSum() {
        int Expected = 13;
        BigClass B = new BigClass();
        int Actual = B.add(6,7);
        Assertions.assertEquals(Expected  ,Actual);
    }
    @Test
    void testString(){
        BigClass S=new BigClass();
        String Actual=S.stringVariableNull("s");
        Assertions.assertNull(Actual);
    }
    @Test
    void testextToUp(){
        String Expected="HI!HOW R U?";
        BigClass U=new BigClass();
        String Actual=U.textToUp("d");
        Assertions.assertEquals(Expected,Actual);
    }
}

