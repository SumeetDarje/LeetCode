
public class Plus_One {

	public static void main(String[] args) {
		int[] a=plusOne(new int[]{9});
		for(int i: a) {
			System.out.print(i);
		}

	}
	
	public static int[] plusOne(int[] digits) {
		
		int n=digits.length;
		for(int i=n-1;i>=0;i--) {
		
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		int newn[]=new int[n+1];
		newn[0]=1;
		return newn;
		
		
		
		
		
		
//	    int sum=0,temp=0,cnt=0;    
//		if(digits[digits.length-1]==0) {
//			digits[digits.length-1]=1;
//			return digits;
//		}else {
//			for(int i: digits) {
//				sum=(sum*10)+i;
//		    }
//			sum++;
//			
//			String s=""+sum;
//			System.out.println(s);
//			char c;
//			int a[]=new int[s.length()];
//			for(int i=0;i<s.length();i++) {
//				c=s.charAt(i);
//				String s1=""+c;
//				a[i]=Integer.parseInt(s1);
//			}
//			return a;
//		}
//		int sum2=sum;
//		while(sum>0) {
//			sum=sum/10;
//			cnt++;
//		}
//		System.out.println(cnt);
//		int c[]=new int[cnt];
//		for(int j=c.length;j>0;j--) {
//			
//		}
	}
}
