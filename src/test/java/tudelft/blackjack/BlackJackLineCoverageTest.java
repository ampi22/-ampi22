package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void rightPlayerWins() {
        int result = new BlackJack().play(10, 21);
        Assertions.assertEquals(21, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 5);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void bothHaveSameWins() {
        int result = new BlackJack().play(21, 21);
        Assertions.assertEquals(21, result);
    }

    @Test
    public void onePlayersGoTooHigh() {
        int result = new BlackJack().play(15, 30);
        Assertions.assertEquals(15, result);
    }
}
