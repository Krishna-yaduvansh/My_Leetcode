class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length; 
        int size = n+1;
        int alt[] = new int[size];
        alt[0] = 0;

        for(int i = 1;i<=n;i++){
            alt[i] = gain[i-1] + alt[i-1];
        }
            int max = 0;
        for(int j = 0;j<alt.length;j++){
           
            max = Math.max(max,alt[j]);
        }
        return max;
    }
}  