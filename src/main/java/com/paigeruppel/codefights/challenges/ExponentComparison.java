package com.paigeruppel.codefights.challenges;

public class ExponentComparison {

    /*

    Let A = a^(b^(c^d)) and B = x^(y^(z^t)).
    You have to compare A and B.

    a --> d ==> m[0] --> m[3]
    */

    public int compare2Power(int[] m) {
        int d = 0;
        for (int a = 3, b = a + 4; a > - 1; a--) {
            if (m[a] > m[b]) {
                return 1;
            }
        }
        return 0;
    }
}
