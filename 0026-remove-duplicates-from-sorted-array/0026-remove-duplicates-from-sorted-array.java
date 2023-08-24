class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int point = index+1;
        while(point < nums.length){
            if(nums[point] == nums[index]){
                point++;
                continue;
            }
            index++;
            nums[index] = nums[point++];
        }
        return index+1;
    }
}