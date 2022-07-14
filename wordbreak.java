class Main
{
   
    public static void wordBreak(List<String> dict, String word, String out)
    {
  
        if (word.length() == 0)
        {
            System.out.println(out);
            return;
        }
 
        for (int i = 1; i <= word.length(); i++)
        {
            
            String prefix = word.substring(0, i);
 
            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), out + " " + prefix);
            }
        }
    }    
}
