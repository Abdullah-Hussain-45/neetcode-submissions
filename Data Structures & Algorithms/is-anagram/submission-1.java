class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        boolean isAnagram = false;
        if(t.length() != s.length()){
            isAnagram = false;
        }else{
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            bubbleSort(arr1);
            bubbleSort(arr2);
            String s1 = String.valueOf(arr1);
            String s2 = String.valueOf(arr2);
            if(s1.equals(s2)){
                isAnagram  = true;
            }
        }

        return isAnagram;
    }
    public void bubbleSort(char[] arr){
        for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j] > arr[j+1]){
                        char temp = arr[j];
                        arr[j] = arr[j+1];    
                        arr[j+1] = temp;
                    }
                }
            }
    }
}
