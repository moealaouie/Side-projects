public class TestPizza
 {

   public static void main(String[] args)
   {
   
   
      Pizza p1=new Pizza();
      Pizza p2=new Pizza("Garlic");
      Pizza p3=new Pizza("Parmesan",'R',"Pineapple","Mushrooms");
      
      display(p1);
      display(p2);
      display(p3);
      
      System.out.println("Number of pizzas sold: " + Pizza.getPizzasSold());
      
      
      }
      public static void display(Pizza p)
      {
      System.out.println("Pizza info!\n" + p.getCrustType()+" pizza, size: "+ 
       p.getSize()+
       "\nToppings are: "+
       p.getTopping1()+
       " and " + p.getTopping2()+"\nPrice is: "+ p.getPrice()+"\n\n");
       }
       }