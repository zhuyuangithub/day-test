package com.bone.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Zhuyuanyuan47
 * @description 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[]

 * @date: 2021/8/17 2:24 PM
 */

public class ThreeNumSum {

    public static void main(String[] args) {
        int[] nums = {-2, -5, -3, 0, -7, 2, 3, 4, 6, -8, -6, -6, -3, 6, 6, 9, 1, 2};
        System.out.println(outLists(nums));
    }

    public static List<List<Integer>> outLists(int[] nums){
        List<List<Integer>> outList = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length < 2) {
            return outList;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            int firstNum = nums[i];
            if (firstNum > 0) {
                break;
            }
            if (i > 0 && firstNum == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1, target = -firstNum;
            while (left < right) {
                int partSum = nums[left] + nums[right];
                if (partSum == target) {
                    outList.add(new ArrayList<>(Arrays.asList(firstNum, nums[left], nums[right])));
                    left ++; right --;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left ++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right --;
                    }
                } else if (partSum < target) {
                    left ++;
                } else {
                    right --;
                }
            }

        }
        return outList;
    }

}
