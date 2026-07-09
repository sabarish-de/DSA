class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max_sum = Integer.MIN_VALUE;
        
        int i=0;
        int j=0;
        int n = nums.length;
        int sum = 0;
        
        while(j<n){
            sum+=nums[j];
            
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max_sum = Math.max(max_sum,sum);
                sum-=nums[i];
                i++;
                j++;
            }
    
        }
        return (double)max_sum/k;
    }
}
