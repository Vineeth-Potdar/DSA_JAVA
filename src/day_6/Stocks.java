package day_6;

public class Stocks {
	public static int prices(int[] price) {
		int profit=0;
		int sell =0;
		int sell_day = 0;
		int buy_day = 0;
		int buy = Integer.MAX_VALUE;
		for(int j=0;j<price.length;j++) {
			if(buy>price[j]) {
				buy=price[j];
				buy_day=j;
			}
		}
		for(int i=0;i<price.length;i++) {
			if(profit<(price[i]-buy)){
				profit = price[i]-buy;
				sell = price[i];
				sell_day=i;
			}
		}
		System.out.println("Buy at "+buy+" on day "+buy_day);
		System.out.println("Sell on day "+sell+" on day "+sell_day);
		return profit;
	}

	public static void main(String[] args) {
		int[] price = {10,20,30,40,25,50};
		int profit=prices(price);
		System.out.println("The maximum profit is : "+profit);
	}

}
