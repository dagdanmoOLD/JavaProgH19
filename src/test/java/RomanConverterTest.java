import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RomanConverterTest {


    @Test
    public void shouldReturnIWhen1(){
        assertEquals("I", toRoman(1));

    }

    @Test
    public void shouldReturnIIWhen2(){
        assertEquals("II", toRoman(2));
    }
    @Test
    public void shouldReturnIIIWhen3(){
        assertEquals("III", toRoman(3));
    }
    @Test
    public void shouldReturnIVWhen4(){
        assertEquals("IV", toRoman(4));
    }
    @Test
    public void shouldReturnVWhen5(){
        assertEquals("V", toRoman(5));
    }@Test
    public void shouldReturnVIIIWhen8(){
        assertEquals("VIII", toRoman(8));
    }





    public static String toRoman(int number) {
    String output = "";
        while (number > 0) {
            if (number < 4) {
                output += "I";
                number -= 1;
            } else if (number == 4) {
                output += "IV";
                number -= 4;
            } else if (number >= 5 && number < 9) {
                output += "V";
                number -= 5;
            }

        }
        return output;
    }


}
