public int countA(String[] arr, String ltr) {
    
    int count = 0;
    String word;
    for(int i = 0; i<arr.length; i++)
    {
        word = arr[i];
        for(int x = 1; x<word.length(); x++)
        {
            if(word.substring(x, x+1).equals(ltr) && x!=word.length()-1)
            {
                count++;
            }
        }
    }
    
    
    
	return count;
}