import java.util.Scanner;

public class Hangman
{

   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);   
         
      String[] movieArray={"Terminator","Inception","Vertigo","A Beautiful Mind","Interstellar","The Avengers","Pulp Fiction","Kill Bill","Young Victoria"};
   
   
      int index=(int)(Math.random()*1000)%9;
  
  
  String answer= movieArray[index];
  
  answer=answer.toLowerCase();
  
  String display="";
  
  for(int x=0;x<answer.length();++x)
  {
  
  if(answer.charAt(x)==' ')
  display+=' ';
   
   else
   display+='*';
  }

do{
System.out.println(display);
System.out.println("Enter letter for guess: ");
char guess=input.nextLine().charAt(0);

guess=Character.toLowerCase(guess);

for(int x=0;x<answer.length();++x)
{

if(answer.charAt(x)==guess)// Match!!
{
display= display.substring(0, x) + guess + display.substring(x+1,answer.length());
}

}

}while(true);

}//end main


}//end class