class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int end;
        Set<Character> resultSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            resultSet.clear();
            resultSet.add(s.charAt(i));
            end = i +1;
            while(end < s.length() && !resultSet.contains(s.charAt(end))){
                resultSet.add(s.charAt(end));
                end++;
            }
            maxCount = Math.max(resultSet.size(), maxCount);
        }
    
        return maxCount;
    }
}