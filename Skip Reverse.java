public static int skipReverse(int[] nums) {
    
    int sum = 0;
    
    for(int i = 0; i<nums.length; i++)
    {
        if(nums[i] == 7)
        {
            i++;
            while(i<nums.length && nums[i] != 7)
            {
                i++;
            }
        }
        else if(nums[i] == 3)
        {
            return sum*2;
        }
        else
        {
            sum += nums[i];
        }
    }
	return sum;
}