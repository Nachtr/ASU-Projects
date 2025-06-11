import java.util.Scanner;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // collect your input(s)
      System.out.print("Enter wall height (feet) : ");
      int heightFt = scnr.nextInt();
      System.out.print("Enter wall width (feet) : ");
      int widthFt = scnr.nextInt();
      
      // compute the required output(s)
      int area = widthFt * heightFt;
      double gallonsPaint = area / 350.0; // making sure not to use 350 here!!!!
      int cans = (int)Math.ceil(gallonsPaint);

      // Spaces
      System.out.println("");

      // display the output(s)
      System.out.printf("Wall area : %d square feet\n", area);
      System.out.printf("Paint needed : %.2f gallons\n", gallonsPaint);
      System.out.printf("Cans needed : %d can(s)\n", cans); // Can we remove the space between (s)\n
   }
}
