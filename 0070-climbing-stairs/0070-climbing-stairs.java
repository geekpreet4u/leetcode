class Solution {
    public int climbStairs(int n) {
        
        int[] ways = new int[n+1];
        if( n <=2)
        return n;
        ways[1] =1;
        ways[2] =2;
        ways[0] =0;
        
        for(int i=3;i <=n; i++){
            ways[i] = ways[i-1] + ways[i-2];

        }

        return ways[n];
    }
}