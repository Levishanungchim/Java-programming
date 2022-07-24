import java.util.Scanner;
 class AreaofRectangle
{
     public static void main(String[] args){

        int l,b,area;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value for sides");
       
         l=r.nextInt();
         b=r.nextInt();
          area=l*b;
          System.out.print( "Area of rectangle:" +area);
      }
}