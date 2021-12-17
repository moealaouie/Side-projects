public class PizzaOrder
{

private Pizza pizza;

private PizzaDelivery pDel;

public PizzaOrder(String c, char s, String t1,String t2,int z)
{

   pizza= new Pizza(c,s,t1,t2);
   pDel = new PizzaDelivery(z);
   
  pDel.calcDeliveryPrice();
}

public void display()
{
    System.out.println("\n\nPizza info!" + pizza.getCrustType()+" pizza, size: "+ 
       pizza.getSize()+
       "\nToppings are: "+
       pizza.getTopping1()+
       " and " + pizza.getTopping2()+"\nPrice is: "+ pizza.getPrice()+"\n\n");
       
       
      
      System.out.println("\nZip code is: " + pDel.getZipCode());
       
      System.out.printf("Delivery price is: $%.2f",pDel.getDelivPrice());
      
      if(pDel.getZipCode()==111111)
         System.out.println("\nThis zip code is out of delivery area");
         
      System.out.printf("\nTotal price is: $%.2f",pDel.getDelivPrice()+pizza.getPrice()); 
      
      System.out.println("\n******************************");  
   
   }    
       
       }
       