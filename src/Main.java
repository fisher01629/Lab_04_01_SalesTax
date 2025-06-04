public class Main
{
    public static void main(String[] args)
    {
        double purchasingPrice = 100.00;
        final double TAX_RATE = 0.05;
        double salesTax = TAX_RATE * purchasingPrice;
        double totalPrice = 0;
        totalPrice = purchasingPrice + salesTax;
        System.out.println("The cost is $" + purchasingPrice);
        System.out.println("The sales tax is $" + salesTax);
        System.out.println("The total price is $" + totalPrice);


    }
}
