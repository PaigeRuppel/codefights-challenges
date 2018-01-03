package com.paigeruppel.codefights.challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KitchenPlannerTest {

    KitchenPlanner underTest;

    @Before
    public void setup() {
        underTest = new KitchenPlanner();
    }

    @Test
    public void chefsWithEqualValuesForOneFoodShouldBeDeterminedBySecondFood() {
        String[] chefs = {"Jack", "Jeanne"};
        String[] food =  {"Pasta", "Chicken"};
        int[][] values = {{3,6}, {3,4}};
        String[] answer = {"Jack - Chicken", "Jeanne - Pasta"};
        assertArrayEquals(answer, underTest.areYouHungary(chefs, food, values));
    }
}

