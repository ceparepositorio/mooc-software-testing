package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
 @Test
 public void cSShort(String message) {
  CaesarShiftCipher cS = new CaesarShiftCipher();
   cS.CaesarShiftCipher("abc");
   Assertions.asserEQuals("def", message);
 }
 //I tried to solve but i cannot do it, i am going to try until i can finish
/*
    @ParameterizedTest(name = "message={0}, shift={1},")
    @CsvSource({
            "abc, 1"
    })
    public void cSShort(String message, int shift, String expectResult){
        CaesarShiftCipher cS = new CaesarShiftCipher();
          cS.CaesarShiftCipher(message, shift).toString();
        Assertions.assertEquals(expectResult, message);

    }
    */

}
