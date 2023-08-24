class Solution {
    public int majorityElement(int[] nums) {
        int[][] result = new int[nums.length][2];
        int index = 0;
        int init = nums[index];
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++){
            if(init != nums[j]){
                index++;
                init = nums[j];
            }
            result[index][0] = nums[j];
            result[index][1]++;
        }
        int majority = 0;
        int count = 0;
        for(int i = 0; i < result.length; i++){
            if(result[i][1] > count){
                majority = result[i][0];
                count = result[i][1];
            }
        }

        return majority;
    }
}