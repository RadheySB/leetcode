class Solution {
    public boolean check(int[] nums) {
        int index=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                if(index==-1){
                    index=i;
                    }
                else{
                    return false;
                }}}
            if(index==-1){
                return true;
            }
            if(nums[0]>=nums[nums.length-1]){
                return true;
            }
            else{
                return false;
            }
        }
}