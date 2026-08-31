class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = nums[i] + sum;
        }
        
        if(sum%2 !=0){
            return false;
        }

        int target = sum/2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for(int i=0; i<nums.length;i++){

            for(int s=target; s>=nums[i];s--){
                dp[s] = dp[s] || dp[s-nums[i]];
            }

        }
        return dp[target];
    }
}