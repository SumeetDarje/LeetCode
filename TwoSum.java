
public class TwoSum {
	
	public static void main(String[] args) {
		int a[]= {2,7,11,15};
		show(a,9); 
	}
	 public static void show(int a[],int target) {
		 int i,j;
		 for(i=0;i<a.length;i++) {
			 for(j=i;j<a.length;j++) {
				 if((a[i]+a[j])==target) {
					 System.out.println(i+ "  " +j);
				 }
			 }
		 }
	 }
}
