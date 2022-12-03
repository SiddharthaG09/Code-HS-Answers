public boolean isLeapYear(int year) {
    boolean leap;
    if(year%4==0 && year%100!=0)
    {
        return true;
    }
    if(year%100==0)
    {
        if(year%400==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    {
        return false;
    }
}
