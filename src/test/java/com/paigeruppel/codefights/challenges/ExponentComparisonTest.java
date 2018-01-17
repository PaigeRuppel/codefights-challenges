package com.paigeruppel.codefights.challenges;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExponentComparisonTest {

    private ExponentComparison underTest;

    @Before
    public void setup() {
        underTest = new ExponentComparison();
    }

    @Test
    public void shouldReturn1AIsGreaterThanBTestCase1() {
        int[] m = {2, 5, 2, 5, 5, 2, 5, 2};
        assertThat(underTest.compare2Power(m), is(1));
    }
}
