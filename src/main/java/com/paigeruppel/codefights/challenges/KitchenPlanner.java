package com.paigeruppel.codefights.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KitchenPlanner {
    public String[] areYouHungary(String[] chefs, String[] food, int[][] values) {
        int maxValue = -2;
        int index = 0;

        Map<String, String> pairs = new HashMap<>();

        for (int j = 0; j < food.length; j++) {
            for (int i = 0; i < values.length; i++) {
                if (values[i][j] >= maxValue) {
                    index = i;
                    maxValue = values[i][j];
                }
            }
            pairs.put(chefs[index], food[j]);
        }
        String[] answer = new String[chefs.length];
        for (int i = 0; i < answer.length; i++) {
            String chef = chefs[i];
            StringBuilder foodForChef = new StringBuilder();
            foodForChef.append(pairs.getOrDefault(chef, "Nothing"));
            answer[i] = chef + " - " + foodForChef.toString();
        }
        return answer;
    }
}
