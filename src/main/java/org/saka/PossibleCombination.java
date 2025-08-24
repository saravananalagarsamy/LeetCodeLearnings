package org.saka;

import java.util.ArrayList;
import java.util.List;

public class PossibleCombination {
    /*
     * []
     * [1][2][3][4]
     * [1,2][1,3][1,4][2,3][2,4][3,4]
     * [1,2,3][1,2,4][1,3,4][2,3,4]
     * [1,2,3,4]
     * 0
     * 1
     * 1,2
     * 1,2,3
     * 1,2,3,4  -> 1,2,3
     */

    public static List<List<Integer>> getAllPossibleCombination(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    result.forEach(combination -> System.out.println(combination));
    return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));
    System.out.println("Adding current " + current );
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);
        System.out.println("i value " + i + "  Before Current " + current);
        backtrack(nums, i + 1, current, result);
        current.remove(current.size() - 1);
        System.out.println("i value " + i + "  After Current " + current);
    }
}
    

}
