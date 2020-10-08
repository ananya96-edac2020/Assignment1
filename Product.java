import java.util.Scanner;
class Product
{
  public static void main(String arg[] )
   {
   int num1;
   int num2;
   int mul;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter int num1" );
       num1=sc.nextInt();
  System.out.println("Enter int num2");
       num2=sc.nextInt();
       sc.close();
    mul=num1*num2;
  System.out.println( mul );
    }

}