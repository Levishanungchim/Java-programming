import java.util.Scanner;
class SumOfTwo
{
  public static void main(String[] args){
     
     int a,b,sum;
     Scanner r=new Scanner(System.in); 

     System.out.print("Enter the two numbers:");
     a=r.nextInt();
     b=r.nextInt();

     sum=a+b;

     System.out.print("Sum:"+sum);
   }
}

