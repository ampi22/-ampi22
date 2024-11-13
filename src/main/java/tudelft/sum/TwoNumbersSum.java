package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
//
import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Create reversed copies to preserve the original lists
        ArrayList<Integer> reversedFirst = new ArrayList<>(first);
        ArrayList<Integer> reversedSecond = new ArrayList<>(second);
        Collections.reverse(reversedFirst);
        Collections.reverse(reversedSecond);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Perform addition digit by digit
        for (int i = 0; i < Math.max(reversedFirst.size(), reversedSecond.size()); i++) {
            int firstVal = i < reversedFirst.size() ? reversedFirst.get(i) : 0;
            int secondVal = i < reversedSecond.size() ? reversedSecond.get(i) : 0;
            int total = firstVal + secondVal + complement;

            // Check for carryover
            if (total >= 10) {
                complement = 1;
                total -= 10;
            } else {
                complement = 0;
            }

            result.add(total);
        }

        // Add remaining carry if there is one
        if (complement == 1) {
            result.add(complement);
        }

        // Reverse to get the final order
        Collections.reverse(result);
        return result;
    }
}

