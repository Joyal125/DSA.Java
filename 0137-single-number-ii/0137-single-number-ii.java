class Solution {
    public int singleNumber(int[] nums) {
        int ones=0 , twoes =0;

        for(int ele : nums){
            ones = (ones^ele)& ~twoes;
            twoes = (twoes^ele)& ~ones;
        }
        
            
        

        return ones;
        
        
    }
}