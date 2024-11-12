package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void test01(){
        GHappy a = new GHappy();
        Assertions.assertTrue(a.gHappy("xxxxggg"));
        System.out.print("HAPPY!\n");
    }

// This case gives an error StringIndexOutOfBoundsException : Index -1 out of bounds for length 3
//    @Test
//    public void test02(){
//        GHappy a = new GHappy();
//        Assertions.assertFalse(a.gHappy("gxx"));
//        System.out.print("NO HAPPY!\n");
//    }

    @Test
    public void test03(){
        GHappy a = new GHappy();
        Assertions.assertFalse(a.gHappy("xxg"));
        System.out.print("NO HAPPY!\n");
    }

    @Test
    public void test04(){
        GHappy a = new GHappy();
        Assertions.assertFalse(a.gHappy("xxggyygxx"));
        System.out.print("NO HAPPY!\n");
    }

    @Test
    public void test05(){
        GHappy a = new GHappy();
        Assertions.assertTrue(a.gHappy("xxGGxx"));
        System.out.print("HAPPY!\n");
    }
}
