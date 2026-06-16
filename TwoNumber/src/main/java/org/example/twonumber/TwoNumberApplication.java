package org.example.twonumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberApplication {

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }

        throw new IllegalArgumentException("No valid pair found");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};

        System.out.println("Example 1: " + Arrays.toString(twoSum(nums1, 9)));
        System.out.println("Example 2: " + Arrays.toString(twoSum(nums2, 6)));
        System.out.println("Example 3: " + Arrays.toString(twoSum(nums3, 6)));
    }
}
