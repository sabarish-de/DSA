class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min_count = Integer.MAX_VALUE;
        int i=0,j=0;
        int n = blocks.length();
        int count = 0;

        while(j<n){
            if(blocks.charAt(j) == 'W'){
                count++;
            }

            if(j-i+1 < k){
                j++;
            }
            else  if(j-i+1 == k){
                min_count = Math.min(min_count,count);

                if(blocks.charAt(i)  == 'W'){
                    count--;
                }
                i++;
                j++;
            }
        }
        return min_count;

    }
}
