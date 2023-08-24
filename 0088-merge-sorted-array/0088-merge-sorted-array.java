class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int stm = 0;
        int stn = 0;
        int[] result = new int[nums1.length];
        int index = 0;
        int copyIndex = 0;
        if (m == 0) {
            for (int node : nums2) {
                nums1[index++] = node;
            }
        } else if (n != 0) {
            while (index < result.length) {
                if (stm == m) {
                    result[index++] = nums2[stn++];
                } else if (stn == n) {
                    result[index++] = nums1[stm++];
                } else if (nums1[stm] > nums2[stn]) {
                    result[index++] = nums2[stn++];
                } else {
                    result[index++] = nums1[stm++];
                }
            }
            for (int node : result) {
                nums1[copyIndex++] = node;
            } 
        }
    }
}