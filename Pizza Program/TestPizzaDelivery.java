public class TestPizzaDelivery
{


public static void main(String[] args)
{

PizzaDelivery d1= new PizzaDelivery();

PizzaDelivery d2= new PizzaDelivery(111111);

d1.calcDeliveryPrice();
d2.calcDeliveryPrice();

display(d1);

display(d2);

}

public static void display(PizzaDelivery d)
{

System.out.println("\nZip code is: " + d.getZipCode());

System.out.printf("Delivery price is: $%.2f",d.getDelivPrice());

if(d.getZipCode()==111111)
System.out.println("\nThis zip code is out of delivery area");
}
}