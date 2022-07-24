package com.Inheritance;

public class A {
    int a,b;
    A(int x, int y)
    {
      a=x;
      b=y;
    }
    void Product()
    {
      int pro = a*b;
      System.out.println("Product = "+pro);
    }
}
class B extends A
{
    int z;
    B(int a, int b, int c)
    {
      super(a,b);
      z=c;
    }
    void Division()
    {
      int div = (a*b)/z;
      System.out.println("Division = "+div);
    }
}
class C extends A
{
    int s;
    C(int a, int b, int d)
    {
      super(a,b);
      s=d;
    }
    void Sum()
    {
      int sum = a+b+s;
      System.out.println("Sum = "+sum);
    }
}
class D
{
  public static void main(String[] args)
  {
    B b=new B(10,15,5);
    b.Product();
    b.Division();
    
    C c=new C(13,12,15);
    c.Product();
    c.Sum();
  }

}





