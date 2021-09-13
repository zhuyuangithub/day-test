package com.bone.leetcode.array;

import java.util.Arrays;

/**
 * @author: Zhuyuanyuan47
 * @description 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * @date: 2021/8/17 3:14 PM
 */
public class NearThreeNumSum {

    public static void main(String[] args) {

    }

    public int getSumCount(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum > target) {
                    right --;
                    // 移动到下一个不相等的元素
                    while (right < left && nums[right] == nums[right + 1]) {
                        right --;
                    }
                } else {
                    left ++;
                    // 移动到下一个不相等的元素
                    while (right < left && nums[left] == nums[left - 1]) {
                        left ++;
                    }
                }
            }
        }
        return ans;
    }
}
