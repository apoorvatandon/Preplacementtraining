public class AnagramInJava
{
  
public static void main (String args[])
  {
    
String s1, s2;
    
Scanner sc = new Scanner (System.in);
    
System.out.println ("Enter first string:");
    
s1 = sc.nextLine ();
    
System.out.println ("\nEnter second string:");
    
s2 = sc.nextLine ();
    

if (s1.length () == s2.length ())
      {
	
checkAnagram (s1, s2);
      
}
     
    else
      {
	
System.out.println ("\nStrings are not Anagram");
      
}
    
sc.close ();
  
}
  
static void checkAnagram (String s1, String s2)
  {
    
char c1[] = s1.toCharArray ();
    
char c2[] = s2.toCharArray ();
    
Arrays.sort (c1);
    
Arrays.sort (c2);
    
if (Arrays.equals (c1, c2))
      {
	
System.out.println ("\nStrings are Anagram");
      
}
    
    else
      {
	
System.out.println ("\nStrings are not Anagram");
      
}
  
}

}
