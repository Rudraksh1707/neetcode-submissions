class Solution {
    public boolean hasDuplicate(int[] nums) {
        


//         Arrays.sort(nums);

//         for(int i =1; i< nums.length;i++){
//             if(nums[i-1] == nums[i] ){
//                 return true;
//             }
        
//         }
//         return false;

    Set<Integer> intSet = new HashSet<>();

    for (int num : nums){
        if(intSet.contains(num)){
            return true;
        }

        intSet.add(num);
    } 

    return false;
   }
}

