//Derek Hong
//CS115
//11.21.2023
//Getting areas of different shapes

public class Areas {
   public static void main (String[] args) {
      double areaOfCircle = circleArea(4.0);
      double areaOfCylinder = cylinderArea(2.0, 5);
      double areaOfRectangle = rectangleArea(4, 7); 
      
      System.out.println(areaOfCircle);
      System.out.println(areaOfCylinder);
      System.out.println(areaOfRectangle);
   }
   
   //getting area of rectangle
   public static double rectangleArea(int w, int l) {
      return w * l;
   }
   
   //area of cylinder
   public static double cylinderArea(double radius, int height) {
      return 3.14 * Math.pow(radius, 2) * height;
   }
   //circle
   public static double circleArea(double radius) {
      return 3.14 * Math.pow(radius, 2);
   }
}