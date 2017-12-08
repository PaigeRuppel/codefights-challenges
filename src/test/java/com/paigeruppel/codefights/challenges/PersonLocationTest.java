package com.paigeruppel.codefights.challenges;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class PersonLocationTest {

    private PersonLocation underTest;

    @Before
    public void setup() {
        underTest = new PersonLocation();
    }

    @Test
    public void toAndFroWithTime3andA2AndB4ShouldReturnPosition3() {
        int a = 2;
        int b = 4;
        int t = 3;
        assertThat(underTest.toAndFro(a, b, t), is(3));
    }

    @Test
    public void toAndFroWithTime8AndA1AndB10ShouldReturnPosition8() {
        int a = 1;
        int b = 10;
        int t = 8;
        assertThat(underTest.toAndFro(a, b, t), is(8));
    }

}
