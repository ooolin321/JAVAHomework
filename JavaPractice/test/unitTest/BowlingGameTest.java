package unitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
    BowlingGame bg;

    private void rollMany(int n, int pins) { //n:球數,pins:瓶數
        for (int i = 0; i < n; i++) {
            bg.roll(pins);
        }
    }

    @BeforeEach
    public void BeforeEach() {
        bg = new BowlingGame();
    }

    @AfterEach
    public void AfterEach() {
        bg = null;
    }

    @Test
    public void testGutter() {
        rollMany(20, 0);
        assertEquals(0, bg.score());
    }

    @Test
    public void testAllOne() {
        rollMany(20, 1);
        assertEquals(20, bg.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        bg.roll(3);
        rollMany(17, 0);
        assertEquals(16, bg.score());
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        bg.roll(3);
        bg.roll(4);
        rollMany(16, 0);
        assertEquals(24, bg.score());
    }

    @Test
    public void testAllStrike() {//全部全倒丟12次Strike
        for(int i =0;i<13;i++){
            rollStrike();
        }
        assertEquals(300, bg.score());
    }

    private void rollSpare() {
        bg.roll(5);
        bg.roll(5);
    }

    private void rollStrike() {
        bg.roll(10);
    }


}