package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void onlyG(){
    GHappy gH = new GHappy();
    boolean result = gH.gHappy("xxggxx");
    Assertions.assertEquals(true, result);

    }
    @Test
    public void onlyG2(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("gg");
        Assertions.assertTrue(result);
        System.out.println(result);

    }
    @Test
    public void onlyG3(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xgg");
        Assertions.assertEquals(true, result);
        System.out.println(result);

    }
    @Test
    public void onlyG4(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxgg");
        Assertions.assertEquals(true, result);
        System.out.println(result);

    }


    @Test
    public void gMixed(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxgxx");
        Assertions.assertEquals(false, result);

    }
    @Test
    public void gMixed2(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xggx");
        Assertions.assertEquals(true,result);
        System.out.println(result);
    }
    @Test
    public void tooMuchG(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyygxxx");
        Assertions.assertEquals(false, result);
        System.out.println(result);

    }



    @Test
    public void tooMuchG2(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }
    @Test
    public void tooMuchG3(){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxgggxyg");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }
}
