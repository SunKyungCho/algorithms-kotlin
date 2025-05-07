package me.study.leetCode.easy

class MissingNumber {


    fun missingNumber(nums: IntArray): Int {

        val n = nums.size
        val total = n * (n + 1) / 2
        val sum = nums.sum()

        return  total - sum
    }
}
