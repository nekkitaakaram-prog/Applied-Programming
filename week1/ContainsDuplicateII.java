class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>lastseen= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if (lastseen.containsKey(num) && i-lastseen.get(num)<=k){
                return true ;
            }
            lastseen.put(num,i);
        }
        return false;
        
    }
}
