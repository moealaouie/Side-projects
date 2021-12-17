public class Pizza
{

   private String crustType;

   private char size;
   private String topping1;
   private String topping2;
   private double price;
   private static int pizzasSold=0;

   public Pizza(String crustType,char s,String t1,String t2)
   {
   
      this.crustType=crustType;
      s=Character.toUpperCase(s);
      topping1=t1;
      topping2=t2;
   
      if(s=='S'||s=='M'||s=='L'||s=='X')
         size=s;
      
      else
      {
         System.out.println("\n\nSize invalid,setting to XL");
         size='X';
      }
      calcPrice();
      pizzasSold++;
   }
   public Pizza()
   {
      this("Plain",'M',"Cheese","Pepperoni");
   
   }
   public Pizza(String c)
   {
   
      this(c ,'M',"","");
   
   }



   public void calcPrice()
   {
   
      switch(size)
      {
      
         case 'S':
            price=5.99;
            break;
      
         case 'M':
            price=7.99;
            break;
      
         case 'L':
            price=9.99;
            break;
      
         case 'X':
            price=11.99;
      
      }
      if(!(topping1.equals("")))
         price+=1;
   
      if(!(topping2.equals("")))
         price+=1;
   }
 
   public String getCrustType()
   {
      return crustType;}
 
   public char getSize()
   {
      return size;}
 
   public String getTopping1()
   {
      return topping1;}
 
   public String getTopping2()
   {
      return topping2;}
 
   public double getPrice()
   {
      return price;}
   public static int getPizzasSold()
   {
      return pizzasSold;}
}
 
