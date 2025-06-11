import java.util.Scanner;

public class Stoplights {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
        
      // Below this comment: declare any variables you may need
    double milesOfRoad;
    int numLane;
    int numIntersect;
    int numStopLi; 
    double costStopLi;

      // Below this comment: collect the requried inputs from the user
    System.out.print("Enter the number of miles of road      : ");
    milesOfRoad = scnr.nextDouble();

    System.out.print("Enter the number of lanes on this road : ");
    numLane = scnr.nextInt();

      // Below this comment: compute and store the required output values
      // Calc the num of intersections  
    numIntersect = (int)(milesOfRoad / 1); // cast to int so that we get a rounded number
      // Test it
      // System.out.print(numIntersect);
      // It works

      // Calc the number of stop lights = lanes * 1 + 2
    numStopLi = numIntersect * (2 + numLane);
      // Test it
      // System.out.print(numStopLi);
      // It works

      // Lastly calc the cost of stoplights
    costStopLi = numStopLi * 25000;

      // Below this comment: disply the required results
    System.out.println("Number of intersections : " + numIntersect);
    System.out.println("Number of stoplights    : " + numStopLi);
    System.out.printf("Cost of stoplights      : $%.2f\n", costStopLi);  
      
   }
}