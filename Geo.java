 import java.util.Scanner;
  class Geo
  {
 public static void main(String args[])
   {
     double radius;
      double area;
      double perimeter;
     Scanner  sc=new Scanner(System.in); 

     System.out.println("Enter the radius of the circle");
     radius=sc.nextDouble();
      sc.close();
     area=3.14*radius*radius;
      perimeter=2*3.14*radius;   
   System.out.println(" area of the circle"+" =" +area);
      
   System.out.println(" perimeter of the circle"+" ="  +perimeter );
   }
}