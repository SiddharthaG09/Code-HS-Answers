public static int sumUpDown(int[] nums, int max) {
    
    int sum = 0;
    boolean canAdd = true;
    
    for(int i = 0; i<nums.length; i++)
    {
        if(sum > max)
        {
            canAdd=false;
        }
        if(sum < 0)
        {
            canAdd = true;
        }
        if(canAdd)
        {
            sum+=nums[i];
        }
        else
        {
            sum -= nums[i];
        }
    }
    
	return sum;
}