import java.util.Scanner;

public class PigLatin

{

   public static void main(String[] args)
   {
   
      Scanner keyboard= new Scanner(System.in);
   
      String pigLatin="";
   
      String word="";
   
      boolean repeat=true;
   
      System.out.println("Enter a word: ");
   
      word=keyboard.nextLine();
   
      if(word.charAt(0)=='y')
      
         pigLatin+=word.substring(1,word.length())+word.charAt(0)+"ay";
      
      else if(word.charAt(0)=='a' || 
      word.charAt(0)=='e'|| 
      word.charAt(0)=='i'|| 
      word.charAt(0)=='o'|| 
      word.charAt(0)=='u')
      
         pigLatin+=word.substring(0,word.length())+"ay";
      else
      
      {
      
         for(int index = 0;index<word.length() && repeat;index++)
         {
         
            if(word.charAt(index)=='a'||
            word.charAt(index)=='e'||
            word.charAt(index)=='i'||
            word.charAt(index)=='o'||
            word.charAt(index)=='u'||
            word.charAt(index)=='y')
            {
            
               repeat=false;
            }
            else
               pigLatin+=word.charAt(index);
         }
      
         pigLatin=word.substring(pigLatin.length(),word.length())+pigLatin+"ay";
      }
   
      System.out.println("input word: " +word);
   
      System.out.println("Pig Latin word:"+pigLatin);
   }
}



