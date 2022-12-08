public static int[] evenlyDivisibleBy(int num) {
    
    int size = 1;
    
    for(int i = 1; i<=num/2; i++)
    {
        if(num%i==0)
        {
            size++;
        }
        
        
    }
    
    int[] result = new int[size];
    
    int k = 0;
    for(int i = 1; i<=num/2; i++)
    {
        if(num%i==0)
        {
            result[k] = i;
            k++;
        }
        
        
    }
    
    result[k] = num;
	return result;
}