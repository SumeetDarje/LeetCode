
public class MedianTwoArray{

	public static void main(String[] args) {
		int num1[]= {1,2,3,4};
		int num2[]= {5,6,7,8};
		
		int size1=num1.length;
		int size2=num2.length;
		
		int num=size1+size2;
		int n[]=new int[num];
		int ncnt=0;
		
		for(int i=0;i<size1;i++) {
			n[ncnt]=num1[i];
			ncnt++;
		}
		for(int i=0;i<size2;i++) {
			n[ncnt]=num2[i];
			ncnt++;
		}
		
		int temp=0;
		for(int i=0;i<ncnt;i++) {
			for(int j=0;j<i;j++) {
				if(n[j]>n[i]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		for(int j:n) {
			System.out.println(j);
		}
		
		int mid=0;
		double midsum=0;
		if(num%2==0) {
			mid=num/2;
			//1,2,3,4 ---> 4/2 = 2 -----> 3
			midsum=(n[mid-1]+n[mid]);
			midsum/=2;
			
			System.out.println(midsum);
		}
		else {
			midsum=n[mid/2];
			System.out.println(midsum);
		}

	}

}
