class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix_pro_array = new int[nums.length];
        int[] suffix_pro_array = new int[nums.length];
        int[] result = new int[nums.length];

        int product = 1;
        int product1 = 1;

        for(int i=0; i<nums.length; i++){
            prefix_pro_array[i] = product;
            product*=nums[i];
            
        }

         for(int i=nums.length-1; i>=0; i--){
            suffix_pro_array[i] = product1;
            product1*=nums[i];
            
        }

        for(int i=0; i<nums.length; i++){
            result[i] = prefix_pro_array[i] * suffix_pro_array[i];
        }

        return result;
        
    }
}
