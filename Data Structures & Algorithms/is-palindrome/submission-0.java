class Solution {
    public boolean isPalindrome(String s) {
        String reverseString = "";
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=(cleanString.length())-1;i>=0;i--){
            reverseString += cleanString.charAt(i);
        }
        return cleanString.equalsIgnoreCase(reverseString);
    }
}
