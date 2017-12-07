import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NthSmallestInteger {


    public int findNthSmallestMultiple(int[] a, int n) {
        List<Integer> aList = new ArrayList<>();
        int count = 1;
        while (aList.size() <= n) {
        for (int i = 0; i < a.length; i++) {
            int next = a[i] * count;
            if (!aList.contains(next)) {
                aList.add(0, next);
            }
        }
            count++;
        }
        Collections.sort(aList);

        return aList.get(n-1) - 2;
    }
}
