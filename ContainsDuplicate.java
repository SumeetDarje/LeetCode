import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[]= {1,4,2,3,1,4,6,7};
		System.out.println(containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums) {
//		Arrays.sort(nums);
//		int temp=0;
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[j]>nums[i]) {
//					temp=nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i]==nums[j]) {
//					 return true;
//				}
//			}
//		}
		
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		
		return false;
    }

}
