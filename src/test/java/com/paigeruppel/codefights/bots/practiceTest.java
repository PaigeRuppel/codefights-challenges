package com.paigeruppel.codefights.bots;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class practiceTest {
    private practice underTest;

    @Before
    public void setup() {
        underTest = new practice();
    }

    @Test
    public void test1() {
        String[] words = {"This",
                "is",
                "an",
                "example",
                "of",
                "text",
                "justification."};
        String[] justified = {"This    is    an",
                "example  of text",
                "justification.  "};
        assertArrayEquals(justified, underTest.textJustification(words, 16));
    }
}
