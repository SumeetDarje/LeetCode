
public class Lemonade_Change {
	
	public static void main(String [] args) {
	
	boolean b=lemonadeChange(new int[] {5,5,5,5,20,20,5,5,5,5});
	System.out.println(b);

	}
	
	public static boolean lemonadeChange(int[] bills) {
        boolean a=true;
        int five=0,ten=0,twenty=0;
		for(int i=0;i<bills.length;i++) {

				if(bills[i]==5) {
					five++;
				}
				else if(bills[i]==10){
					if(five==0) {
						a=false;
					}
					else {
						ten++;
						five--;
					}
				}
				else if(bills[i]==20) {
					
					if(ten>=1 && five>=1) {
						five--;
						ten--;
						twenty++;
					}
					else if(five>=3 ) {
						five-=3;
						twenty++;
					}
					else {
						a=false;
					}
				}
		}
		return a;
    }
}
