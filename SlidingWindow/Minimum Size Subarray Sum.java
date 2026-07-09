class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min_len = Integer.MAX_VALUE;
        int n = nums.length;
        int i=0,j=0;
        int sum = 0;
        int len = 0;

        while(j<n){
            sum+=nums[j];

            if(sum<target){
                j++;
            }
            else if(sum >= target){
                while(sum>=target){
                    min_len = Math.min(min_len,j-i+1);
                    sum-=nums[i];
                    i++;
                }
                j++;
            }
        }
        return (min_len == Integer.MAX_VALUE ? 0 : min_len);
    }
}
