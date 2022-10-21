public String catDog(String a, String b) {
    boolean aHasDog = a.contains("dog");
    boolean bHasDog = b.contains("dog");
    boolean aHasCat = a.contains("cat");
    boolean bHasCat = b.contains("cat");
    
    if(!aHasCat && !bHasCat && !aHasDog && !bHasDog)
    {
        return "";
    }
    else if(bHasCat && !bHasDog && !aHasDog && !aHasCat)
    {
        return "dog";
    }
    else if(aHasDog && !bHasDog && !bHasCat && !aHasCat)
    {
        return "cat";
    }
    else if(aHasCat && !aHasDog && !bHasDog && !bHasCat)
    {
        return "dog";
    }
    else if(bHasDog && !bHasCat && !aHasDog && !aHasCat)
    {
        return "cat";
    }
    else if(aHasDog && aHasCat && !bHasDog && !bHasCat)
    {
        int indexDog;
        int indexCat;
        
        if(a.indexOf("d")<a.indexOf("c"))
        {
            return "dogcat";
        }
        else
        {
            return "catdog";
        }
    }
    else if(bHasDog && bHasCat && !aHasDog && !aHasCat)
    {
        int indexDog;
        int indexCat;
        
        if(b.indexOf("d")<b.indexOf("c"))
        {
            return "dogcat";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasDog && bHasCat && !aHasCat && !bHasDog)
    {
        int indexDog = a.indexOf("d");
        int indexCat = b.indexOf("c");
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else if(indexDog==indexCat)
        {
            return "";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasCat && bHasDog && !aHasDog && !bHasCat)
    {
        int indexDog = b.indexOf("d");
        int indexCat = a.indexOf("c");
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else if(indexDog==indexCat)
        {
            return "";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasDog && aHasCat && bHasDog && !bHasCat)
    {
        int indexDog;
        int indexCat = a.indexOf("c");
        
        if(a.indexOf("d") < b.indexOf("d"))
        {
            indexDog=a.indexOf("d");
        }
        else
        {
            indexDog=b.indexOf("d");
        }
        
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else if(indexDog==indexCat)
        {
            return "";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasCat && bHasCat && !bHasDog && !aHasDog)
    {
        return "dog";
    }
    else if(aHasCat && aHasDog && bHasCat && !bHasDog)
    {
        int indexDog = a.indexOf("d");
        int indexCat;
        if(a.indexOf("c")<b.indexOf("c"))
        {
            indexCat = a.indexOf("c");
        }
        else
        {
            indexCat=b.indexOf("c");
        }
        
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else if(indexDog==indexCat)
        {
            return "";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasCat && bHasDog && bHasCat && !aHasDog)
    {
        int indexDog = b.indexOf("d");
        int indexCat;
        
        if(a.indexOf("c")<b.indexOf("b"))
        {
            indexCat=a.indexOf("c");
        }
        else
        {
            indexCat=b.indexOf("c");
        }
        
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasDog && bHasDog && bHasCat && !aHasCat)
    {
        int indexDog;
        int indexCat = b.indexOf("c");
        
        if(a.indexOf("d")<b.indexOf("d"))
        {
            indexDog=a.indexOf("d");
        }
        else
        {
            indexDog=b.indexOf("d");
        }
        
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else
        {
            return "catdog";
        }
    }
    else if(aHasDog && aHasCat && bHasDog && !bHasCat)
    {
        int indexDog;
        int indexCat = a.indexOf("c");
        
        if(a.indexOf("d")<b.indexOf("d"))
        {
            indexDog=a.indexOf("d");
        }
        else
        {
            indexDog=b.indexOf("d");
        }
        
        if(indexDog<indexCat)
        {
            return "dogcat";
        }
        else
        {
            return "catdog";
        }
        
    }
    else if(aHasDog && aHasCat && bHasDog && bHasCat)
    {
        int indexDog;
        int indexCat;
        
        if(a.indexOf("d")<b.indexOf("d"))
        {
            indexDog=a.indexOf("d");
        }
        else
        {
            indexDog=b.indexOf("d");
        }
        
        if(a.indexOf("c")<b.indexOf("c"))
        {
            indexCat=a.indexOf("c");
        }
        else
        {
            indexCat=b.indexOf("c");
        }
        if(indexDog<indexCat)
        {
            return "dogcat";
        } 
        else
        {
            return "catdog";
        }
    }
    else
    {
        return "dog";
    }

}
