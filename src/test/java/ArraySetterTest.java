
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySetterTest {
        @Test
        void testArraySetOnes(){
            ArraySetter testObject = new ArraySetter();
            int[] testArray = {0,3,5,1,0,5,0};
            int[] expectedArray = {1,3,5,1,1,5,1};
            int[] actualArray = testObject.setOnes(testArray);
            Assertions.assertArrayEquals(expectedArray,actualArray);
        }
        @Test
        void testArraySetZeroesToOnesLength(){
            ArraySetter testObject = new ArraySetter();
            int[] testArrayOk = {1,1,1,1};
            int[] testArrayTooLong = {1,1,1,1,1,1,1,1,1,1,1,1};
            int expectedOk = 4;
            int expectedTooLong = 10;
            int[] actualOk = testObject.setZeroesToOnes(testArrayOk);
            int[] actualTooLong = testObject.setZeroesToOnes(testArrayTooLong);
            Assertions.assertEquals(expectedOk,actualOk.length);
            Assertions.assertEquals(expectedTooLong,actualTooLong.length);
        }
    }

