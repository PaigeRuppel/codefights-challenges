package com.paigeruppel.codefights.challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BestFriendPredictorTest {

    private BestFriendPredictor underTest;

    @Before
    public void setup() {
        underTest = new BestFriendPredictor();
    }

    @Test
    public void isBestFriendNamesShouldReturnTrueForBobAndDan() {
        assertTrue(underTest.bestFriendNames("Bob", "Dan"));
    }

    @Test
    public void isBestFriendNamesFalseForAliceAndDiego() {
        assertFalse(underTest.bestFriendNames("Alice", "Diego"));
    }
}
