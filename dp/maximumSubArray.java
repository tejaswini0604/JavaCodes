/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            sum+=n;
            if(sum>max){
                max=sum;
            }
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
}