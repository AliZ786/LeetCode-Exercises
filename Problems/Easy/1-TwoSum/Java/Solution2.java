package Java;

// import Java.util.HashMap;
// import Java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> missingVal = new HashMap<>();
        int n = nums.length;
        for (int i =0; i<n;i++){
            int diff = target - nums[i];
            
            if (missingVal.containsKey(diff)){
                return new int[]{missingVal.get(diff),i};
            }

            missingVal.put(nums[i],i);
        }

            return new int[]{};
                
            }
      
    }
    /*
    * Runtime = 2 ms
    */