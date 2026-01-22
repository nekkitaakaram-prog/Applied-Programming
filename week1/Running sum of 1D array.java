class Solution {
    public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int i=0;
        while (i<nums.length){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            result[i]=sum;
            i=i+1;
        }
        return result;
        
    }
}
