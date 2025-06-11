import java.util.Scanner;

public class Asphalt {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      // length of new road in miles (as a double)
      // number of lanes on this road (as an int)
      // depth of the asphalt in inches (as an int)

      // Input vari
      double lengthRoad;
      int numberLanes;
      int depthInches;

      // For general calc
      double lengthFeet;
      double widthFeet;
      double depthFeet;

      // Volume and Weight calc
      double volumeCubFeet;
      double weightPounds;
      double totalTons;

      // Truckloads and Cost calc
      int trucksNeeded;
      double totalCost;
      
      // Below this comment: collect the required inputs

      System.out.print("Enter length of road in miles    : ");
      lengthRoad = scnr.nextDouble();

      System.out.print("Enter number of lanes            : ");
      numberLanes = scnr.nextInt();

      System.out.print("Enter depth of asphalt in inches : ");
      depthInches = scnr.nextInt();

      // Below this comment: write Java code to do the computations needed to determine the correct output
      lengthFeet = lengthRoad * 5280.0; 
      widthFeet = numberLanes * 12.0;
      depthFeet = (double)(depthInches) / 12; // Have to cast to double otherwise does int div

      // Actual vol calc
      // Volume in cubic feet = length * width * depth
      volumeCubFeet = lengthFeet * widthFeet * depthFeet;

      // Weight and trucks
      weightPounds = volumeCubFeet * 145;
      totalTons = weightPounds / 2000;

      trucksNeeded = (int) Math.ceil(totalTons / 5.0);

      // Price
      totalCost = trucksNeeded * 5 * 150.0;
    
      // Below this comment: output the correct output
      System.out.println("Truckloads of asphalt needed is  : " + trucksNeeded);
      System.out.printf("Total cost of asphalt is         : $%.2f\n", totalCost);

   }
}
