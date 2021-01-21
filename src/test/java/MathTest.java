import org.junit.jupiter.api.*;
public class MathTest {
    @Test
    void CheckMathMax(){
        int lowerNum=45;
        int higherNum=50;

        int Expected = higherNum;
        int Actual = Math.max(lowerNum,higherNum);

        Assertions.assertEquals(Expected,Actual);
    }

    @Test
    void CheckMathMaxError(){
        int lowerNum=45;
        int higherNum=50;

        int Expected = lowerNum;
        int Actual = Math.max(lowerNum,higherNum);

        Assertions.assertEquals(Expected,Actual);
    }
    @Test
    void CheckMathMin(){
        int lowerNum=20;
        int higerNum=25;

        int Expected= lowerNum;
        int Actual = Math.min(lowerNum,higerNum);

        Assertions.assertEquals(Expected,Actual);
    }
    @Test
    void CheckMathMinError(){
        int lowerNum=20;
        int higherNum=25;

        int Expected =higherNum;
        int Actual = Math.min(lowerNum,higherNum);

        Assertions.assertEquals(Expected,Actual);

    }
}

