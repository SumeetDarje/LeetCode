
public class SearchInsertPos{

	public static void main(String[] args) {
		int nums[]= {1,3,5,6};
		int target=10;
		System.out.println(searchInsert(nums,target));
		
	}
	public static int searchInsert(int[] nums, int target) {

		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==target) {
				return i;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>target) {
				return i;
			}
		}
		if(nums[0]>target) {
			return 0;
		}
		else if(nums[nums.length-1]<target) {
			return nums.length;
		}
		return -1;
	}
}
