
public class SingleNumber {

	public static void main(String[] args) {
		int nums[]= {2,2,1};
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
		
		int val=0;
		for(int i=0;i<nums.length;i++) {
			val=val ^ nums[i];
		}
        return val;
//		
//		 int count = 0;
//	        int maxcount=nums[0];
//
//	        for(int i = 0; i < nums.length; i++)
//	        {
//	            int mcount=0;
//	            for(int j = 0; j < nums.length; j++)
//	            {
//	                if(nums[i] == nums[j])
//	                {
//	                    mcount++;
//	                }
//	            }
//
//	            if(mcount == 1)
//	            {
//	                maxcount=nums[i];
//	                return maxcount;
//	            }
//	        }
//
//	        return 0;
    }
	
}
