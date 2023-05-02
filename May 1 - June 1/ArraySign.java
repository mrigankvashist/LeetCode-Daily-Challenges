class Solution {
    public int arraySign(int[] nums) {
        int l=nums.length;
        double x=1;
        for(int i=0;i<l;i++){
            x*=nums[i];
        }
        if(x>0){
            return 1;
        }
        else if(x<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}