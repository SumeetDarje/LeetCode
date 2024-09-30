
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12));
		

	}
	public static boolean isPalindrome(int x) {
		int sum=0,temp=0,x2=x;
		while(x>0) {
			temp=x%10;// 1 ,12%10=2
			sum=(sum*10)+temp;// sum=0 sum=1 sum=12
			x/=10;//x=12 x=1
		}
		if(x2==sum) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
