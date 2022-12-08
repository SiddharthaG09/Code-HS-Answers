public int[] rotate(int[] array, int dir) {
    
    if(array.length <= 1)
    {
        return array;
    }
    
    dir = (dir%array.length + array.length) % array.length;
    
    for(int k = 0; k < dir; k++)
    {
        int backup = array[array.length-1];
        for(int i = array.length-1; i>0; i--)
        {
            array[i] = array[i-1];
        }
        
        array[0] = backup;
        
        
        
    }
	return array;
}