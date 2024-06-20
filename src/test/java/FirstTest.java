import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstTest {

//кратно 3, 'T'
// кратно 5,'M'
// кратно 3 и 5, 'EMC'
// 'Fail'
    public String trialCode(int number) {
         if (number % 3 == 0 && number % 5 == 0) {
            return "EMC";
         }
         else if (number % 3 == 0) {
            return "T";
        }
        else if (number % 5 == 0) {
            return "M";
        }

        else return "FAIL";
    }

    @Test
    public void tmcTest() {
        int number;
        String actualResult = trialCode(number= 9);
        String expected;
        assertEquals(actualResult, expected= "T");
    }
    @Test
    public void tmcTest1() {
        int number;
        String actualResult = trialCode(number= 10);
        String expected;
        assertEquals(actualResult, expected= "M");
    }
    @Test
    public void tmcTest2() {
        int number;
        String actualResult = trialCode(number= 15);
        String expected;
        assertEquals(actualResult, expected= "EMC");
    }
    @Test
    public void tmcTest3() {
        int number;
        String actualResult = trialCode(number= 17);
        String expected;
        assertEquals(actualResult, expected= "FAIL");
    }
}
