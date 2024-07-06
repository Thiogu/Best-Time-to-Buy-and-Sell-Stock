class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length; //end of array  1,2,3....n
        if(size == 1 ){
            return 0;
        }
        int highestSell = prices[size -1]; //the last day (index) to sell - 0,1,2..n-1
        int lowestBuy =  prices[size - 2]; //automatically day before you buy
        int maxProfit = highestSell - lowestBuy;
        for(int i = size - 2; i >= 1; i--){ //stop before it reaches 0,stop at 1
            System.out.println("index: " +i);
            if(prices[i] > highestSell){
                highestSell = prices[i];
                lowestBuy = prices[i - 1];
                int profit =  highestSell - lowestBuy;
                if (profit > maxProfit ){ //keep track of max profit
                    maxProfit = profit; 
                }
        
            }//close if
            else{
                if(prices[i - 1] < lowestBuy){
                    lowestBuy = prices[i - 1];
                    int profit =  highestSell - lowestBuy;
                    if (profit > maxProfit ){
                        maxProfit = profit; 
                     }//close inner inner if
                }//close inner-if
            }//close else
        }//close for

        if (maxProfit < 0){
            return 0;
        }
        return maxProfit;
        
    }
}