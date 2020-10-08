import java.util.Scanner;
class Rect1
 {
   public static void main(String args[] )
  {
      int width;
      int height;
        int area;
      int  perimeter;
     Scanner method=new Scanner(System.in); 
    System.out.println("enter  the width of the rectangle");
    width=sc.nextInt();

    System.out.println("enter the height of the rectangle");
    height=sc.nextInt();
    sc.close();
    area=(width*height);
    perimeter=2*(width+height);
    System.out.println("area of rectangle"+area);
    System.out.println("perimeter of rectangle"+perimeter);
   

  }
}