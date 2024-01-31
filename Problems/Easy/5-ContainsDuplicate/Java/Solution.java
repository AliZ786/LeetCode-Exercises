package Problems.Easy.5-ContainsDuplicate.Java;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        int n = nums.length;

        for (int i =0; i<n; i++){
            if(numbers.contains(nums[i])){
                return true;
                
            }
            numbers.add(nums[i]);
        }
        return false;
    }
}