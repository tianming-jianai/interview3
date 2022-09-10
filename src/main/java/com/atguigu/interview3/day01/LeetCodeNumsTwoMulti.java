package com.atguigu.interview3.day01;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @BelongsProject: interview3
 * @BelongsPackage: com.atguigu.interview3.day01
 * @Author: 张世罡
 * @CreateTime: 2022-03-14 17:37
 * @Description:
 */
public class LeetCodeNumsTwoMulti {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
//        int[] result = getIndex(nums, target);
//        System.out.println(Arrays.toString(result));

        int[] result2 = twoSum(nums, target);
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 暴力解法
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] getIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * hash值优化解法
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int partnerNumber = target - nums[i];
            if (map.containsKey(partnerNumber)) {
                return new int[]{i, map.get(partnerNumber)};
            }
            // map k值 v下标
            //     2   0
            map.put(nums[i], i);
        }
        return null;
    }

}
