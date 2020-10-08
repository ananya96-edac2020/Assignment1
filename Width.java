import java.util.Scanner;
class Width
 {
   public static void main(String args[] )
  {
    double width;
    double height;
    double area;
    double perimeter;
     Scanner sc=new Scanner(System.in); 
     System.out.println("enter  the width of the rectangle");
    width=sc.nextDouble();

    System.out.println("enter the height of the rectangle");
    height=sc.nextDouble();
    method.close();
    area=(width*height);
    perimeter=2*(width+height);
    System.out.println("area of rectangle"+area);
    System.out.println("perimeter of rectangle"+perimeter);
   

  }
}