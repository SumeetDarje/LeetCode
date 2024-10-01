
public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[]=removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	 public static int[] removeDuplicates(int[] nums) {
		 int i,j,cnt1=0,cnt2=0;
		 for(i=0;i<nums.length;i++) {
			 for(j=i+1;j<nums.length;j++) {
				if(nums[i]!=-1) {
					if(nums[i]==nums[j]) {
						 nums[j]=-1;
					}
				}
			 }
		 }
		 for(int z: nums) {
			 if(z!=-1) {
				 cnt2++;
			 }			 
		 }
		 int b[]=new int [cnt2];
		 for(int z: nums) {
			 if(z!=-1) {
				 nums[cnt1]=z;
				 cnt1++;
			 }
		 }
		 return nums;
	 }
}

