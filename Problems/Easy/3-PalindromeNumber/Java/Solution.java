package Problems.Easy.3-PalindromeNumber.Java;

class Solution {
    public boolean isPalindrome(int x) {
        if (x ==0){
            return true;
        }
        if (x <0 || x % 10 ==0){
            return false;
        }

        int reverse_val = 0;

        while (x > reverse_val){
            int remainder = x %10;
            x/=10;

            reverse_val = (reverse_val *10) + remainder;
        }

        if (x == reverse_val || x == reverse_val/10){
            return true;
        }
        else{
            return false;
        }

    

        
        
    }
}

/*
 * Runtime: 4ms
 */