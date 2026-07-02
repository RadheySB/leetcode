class Solution {
    public boolean isPalindrome(int n) {
        int digit=0;
        int original=n;
        while(n>0){
            int ld=n%10;
            digit=digit*10+ld;
            n=n/10;
        }
        return original==digit;
    }
}