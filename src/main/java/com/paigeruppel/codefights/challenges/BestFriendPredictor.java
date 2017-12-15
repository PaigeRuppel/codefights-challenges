package com.paigeruppel.codefights.challenges;

import java.util.HashMap;
import java.util.Map;

public class BestFriendPredictor {
    public boolean bestFriendNames(String name1, String name2) {
        Map<Character, Integer> a = new HashMap<>();
        a.put(' ', 0);
        int v = 1, f=0, g=0;
        for (char ch = 'a'; ch <= 'z'; ++ch)
            a.put(ch, v++);
        for (char c:name1.toLowerCase().toCharArray())
            f += a.get(c);
        for (char c:name2.toLowerCase().toCharArray())
            g+= a.get(c);
        return f == g;
    }
}
