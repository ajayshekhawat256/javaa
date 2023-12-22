public class StockPrice {
    public static int Buy_And_Sell(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int Max_Profit= 0;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit=prices[i]-buy_price;
                Max_Profit=Math.max(Max_Profit, profit);
            }
            else{
                buy_price=prices[i];
            }
        }
        return Max_Profit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Buy_And_Sell(prices));
    }
}
