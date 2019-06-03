/*On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
          for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    
    }
}