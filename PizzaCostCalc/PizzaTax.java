import java.util.Scanner;

public class PizzaTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pizza Total
        double pizzaprice = scanner.nextDouble();
        System.out.println("Pizza Total: $" + pizzaprice);

        // Pizza Tax
        double pizzatax = (pizzaprice * 0.0625);
        System.out.println("Pizza Tax: $:" + pizzatax);

        // Pizza Tip
        double pizzatip = (pizzaprice * 0.02);
        System.out.println("Pizza Tip 20%: $" + pizzatip);


        // Total Cost
        double total = pizzaprice + pizzatax + pizzatip;
        System.out.println("Total: $" + total);
    }
}
