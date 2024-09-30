import java.util.Iterator;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int [] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		
	}
	
	 public static int maxProfit(int[] prices) {
		 
		 int bprice=prices[0];
		 int cprofit=0;
		 int mprofit=0;
		 
		 for(int i=0;i<prices.length;i++){
			 if(prices[i]<bprice) {
				 bprice=prices[i];
			 }
			 else {
				 cprofit=prices[i]-bprice;
				 mprofit=Math.max(cprofit, mprofit);
			 }
		 }
		 return mprofit;
	 }

}
