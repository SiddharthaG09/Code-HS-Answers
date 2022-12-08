public static int[] singleDigits(int[] nums) {
	
	String str = "";
	
	for(int num : nums)
	{
	    str+=num;
	}
	
	int[] result = new int[str.length()];
	
	int k = result.length-1;
	for(int i = nums.length-1; i>=0; i--)
	{
	    while(nums[i]!=0)
	    {
	        result[k] = nums[i] % 10;
	        nums[i] = nums[i]/10;
	        
	        k--;
	    }
	}
	
	return result;
}