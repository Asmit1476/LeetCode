class Solution {
    public int missingNumber(int[] nums) {
        int totalSum =0;
        int n = nums.length;
        int sum = n*(n+1)/2;


        for(int i=0; i<n;i++){
            totalSum = totalSum + nums[i];
        }

        int missingNumber = sum - totalSum;

        return missingNumber;
 

    }
    
}