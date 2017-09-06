package org.bluestreakxmu;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        // 从小到大排序（冒泡排序）
        // 排序过程中求值
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length - 1 - i; ++j) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }

            if (i % 2 != 0) {
                result += nums[(nums.length-1)-i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(new Solution().arrayPairSum(arr));
    }
}
