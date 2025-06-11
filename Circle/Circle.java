class Circle {
  public static void main(String[] args) {
    // Constant Var for Pi
    final double PI = 3.1415;
    
    // Calc
      double radius = 10.25; // Radius is hard-coded into the script
      double diameter = radius * 2;
      double circumference = (PI * diameter); // Was using Math.PI instead of 3.1415. Decided to make it a final var.
      double area = (PI * (radius * radius)); 
      double areaOfSemiCirc = area * 0.5; // Im going to use .5 instead of (1.0 / 2.0)

    // Default
      System.out.println("Properties of a Circle");
      System.out.println("Radius             : " + radius);
      System.out.println("Diameter           : " + diameter);
      System.out.println("Circumference      : " + circumference);
      System.out.println("Area               : " + area);
      System.out.println("Area of Semicircle : " + areaOfSemiCirc);
    
    // Blank space
      System.out.println();

    // Use casting to round the numbers
    int radiusRounded =  (int) radius;
    int diameterRounded = (int) diameter;
    int circumferenceRounded = (int) circumference;
    int areaRounded = (int) area;
    int areaOfSemiCircRounded = (int) areaOfSemiCirc;

    // Rounded
      System.out.println("Properties \"Rounded\" Down"); // Originally thought that using %.0f would work too
      System.out.println("Radius             : " + radiusRounded);
      System.out.println("Diameter           : " + diameterRounded);
      System.out.println("Circumference      : " + circumferenceRounded);
      System.out.println("Area               : " + areaRounded);
      System.out.println("Area of Semicircle : " + areaOfSemiCircRounded);

  }
}
