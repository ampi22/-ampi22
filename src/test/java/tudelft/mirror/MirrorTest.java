package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void testMirrorEndsFullMatch() {
        Mirror mirror = new Mirror();
        String input = "abccba";
        String expected = "abccba";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsPartialMatch() {
        Mirror mirror = new Mirror();
        String input = "abca";
        String expected = "a";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsNoMatch() {
        Mirror mirror = new Mirror();
        String input = "abc";
        String expected = "";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsSingleCharacter() {
        Mirror mirror = new Mirror();
        String input = "a";
        String expected = "a";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsEmptyString() {
        Mirror mirror = new Mirror();
        String input = "";
        String expected = "";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsOddLengthMatch() {
        Mirror mirror = new Mirror();
        String input = "racecar";
        String expected = "racecar";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }

    @Test
    public void testMirrorEndsEvenLengthPartialMatch() {
        Mirror mirror = new Mirror();
        String input = "abcddcbaef";
        String expected = "abcddcba";
        Assertions.assertEquals(expected, mirror.mirrorEnds(input));
    }
}
