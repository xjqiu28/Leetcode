class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = prices.length;
        long n = 0;
        for (int i =0; i<prices.length - 1; i++){
            if(prices[i]-prices[i+1] == 1){
                n += 1;
            }else{
                count = count + (n*(n+1))/2;
                n=0;
            }
        }
        count = count + (n*(n+1))/2;
        
        return count;
    }
}