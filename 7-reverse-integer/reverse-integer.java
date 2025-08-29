class Solution {
    public int reverse(int x) {
        long result = 0;
        int temp = x;
      
        while(temp != 0) {
            result = result * 10 + temp % 10;
            temp = temp/10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }
}