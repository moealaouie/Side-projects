public class PizzaDelivery
{

   private int zipCode;

   private double delivPrice;

   public PizzaDelivery()
   {
   
      zipCode=48128;
   
   }

   public PizzaDelivery(int z)
   {
   
      zipCode=z;
   
      if(zipCode==48124||zipCode==48120||zipCode==48128)
      
         zipCode=zipCode;
      
      else
      
         zipCode=111111;
   }

   public void calcDeliveryPrice()
   {
   
      if(zipCode==48128)
         delivPrice+=1;
      
      else if(zipCode==48120)
         delivPrice+=3;
      
      else
      
         delivPrice+=5;
   
   }

   public int getZipCode()
   {
      return zipCode;}

   public double getDelivPrice()
   {
      return delivPrice;}


}


 
