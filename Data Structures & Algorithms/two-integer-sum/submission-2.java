class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  Map<Integer, Integer> compliments = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     Integer complimentIndex = compliments.get(nums[i]);
        //     if(complimentIndex != null){
        //         return new int[]{complimentIndex, i};
        //     }
        //     compliments.put(target - nums[i], i);
        // }
        // return nums;

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int findme = target - nums[i];
            if(map.containsKey(findme)){
                return new int [] {map.get(findme) , i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
