import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int nums[] = {6,5,5};
		System.out.println(majorityElement(nums));

	}
	
	public static int majorityElement(int[] nums) {
		
		Arrays.sort(nums);
		int n=nums.length;
		return nums[n/2];
        
//		int maxo=nums[0],cnt=0;
//		
//		for(int i=0;i<nums.length;i++) {
//			if(cnt==0) {
//				cnt++;
//				maxo=nums[i];
//			}
//			else if(maxo==nums[i]) {
//				cnt++;
//			}
//			else {
//				cnt--;
//			}
//		}
//		
//		return maxo;
		
		}
    }

