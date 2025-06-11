import java.util.Scanner;

public class TipCalculator {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
        
      // Below this comment: declare any variables you may need
      // Tip numbers
      double tenPer;
      double fifteenPer;
      double twentPer;
      double twentFivePer;
      double thirtPer;

      // Bill  
      double bill;
      
      // Totals (making multiple for ease)
      double tenTot;
      double fifteenTot;
      double twentTot;
      double twentFiveTot;
      double thirtTot;

      // Below this comment: collect the requried inputs from the user
      System.out.print("Enter the check amount : ");
      bill = scnr.nextDouble();

      // Below this comment: compute and store the required output values
      // tip calc  
      tenPer = bill * .10;
      fifteenPer = bill * .15;
      twentPer = bill * .20;
      twentFivePer = bill * .25;
      thirtPer = bill * .30;

      // total calc
      tenTot = bill + tenPer;
      fifteenTot = bill + fifteenPer;
      twentTot = bill + twentPer;
      twentFiveTot = bill + twentFivePer;
      thirtTot = bill + thirtPer;

      // Below this comment: disply the required results
      System.out.printf("Total with 10%% tip ($%.2f) is $%.2f\n", tenPer, tenTot);
      System.out.printf("Total with 15%% tip ($%.2f) is $%.2f\n", fifteenPer, fifteenTot);
      System.out.printf("Total with 20%% tip ($%.2f) is $%.2f\n", twentPer, twentTot);
      System.out.printf("Total with 25%% tip ($%.2f) is $%.2f\n", twentFivePer, twentFiveTot);
      System.out.printf("Total with 30%% tip ($%.2f) is $%.2f\n", thirtPer, thirtTot);
   }
}