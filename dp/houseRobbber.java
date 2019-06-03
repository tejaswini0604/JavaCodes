/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int res[]=new int[nums.length];
        int n=nums.length-1;
        res[n]=nums[n];
        res[n-1]=Math.max(nums[n],nums[n-1]);
     //   int i=n-2;
        for(int i=n-2;i>=0;i--){
            res[i]=Math.max((nums[i]+res[i+2]),res[i+1]);
          //  i--;
        }
        return res[0];
        
    }
}