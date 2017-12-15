package com.paigeruppel.codefights.challenges;

public class BestFriendPredictor {
    public boolean bestFriendNames(String name1, String name2) {
        int i = -96;
        int j = -96;
        for (char c : name1.toLowerCase().toCharArray()) {
            i += (int)c;
        }
        for (char c : name2.toLowerCase().toCharArray()) {
            j += (int)c;
        }
        return i == j;
    }
}
