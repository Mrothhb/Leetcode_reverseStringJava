class Solution {
    /*
    * Function to reverse the characters in a string
    * no return value, input char array 
    */
    public void reverseString(char[] s) {
        if(s.length==0) // return early if the char array is empty 
            return;
        int mid = (s.length/2); // get the midpoint of the string 
        int len = s.length-1;   // get index of the last char in array 
        char temp = s[0];   // init the temp variable for swaps
        
        // loop through and swap elements 
        for(int i = 0; i<s.length; i++){
            if(i==mid)
                break;
            temp = s[i];
            s[i] = s[len-i];
            s[len-i] = temp;
        }
    }
}


