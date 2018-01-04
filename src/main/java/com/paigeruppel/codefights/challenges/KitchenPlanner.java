package com.paigeruppel.codefights.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KitchenPlanner {
    public String[] areYouHungary(String[] chefs, String[] food, int[][] values) {
        int maxValue = -1;
        int index = 0;

        Map<String, String> pairs = new HashMap<>();
        for (int j = 0; j < food.length; j++) {
            for (int i = 0; i < values.length; i++) {
                if (values[i][j] > maxValue) {
                    index = i;
                    maxValue = values[i][j];
                }
            }
            pairs.put(chefs[index], food[j]);
        }
        String[] answer = new String[3];
        answer[0] = String.valueOf(pairs.entrySet());
        return answer;
    }
}
