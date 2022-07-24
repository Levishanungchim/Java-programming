

class A
{
   int a,b,c;
   void add()
   {
     a=10;b=4;
     c=a+b;
     System.out.println("Sum of two numbers: "+c);
   }
     void sub()
   {
     a=20;b=14;
     c=a-b;
     System.out.println("Sub of two numbers: "+c);
   }
}
class B extends A
{
  void multiply()
   {
     a=30;b=6;
     c=a*b;
     System.out.println("Multiplication of two numbers: "+c);
    } 
    void div()
   {
     a=50;b=25;
     c=a/b;
     System.out.println("Division of two numbers: "+c);
    }
}
class C extends B
{
 void rem()
   {
     a=40;b=6;
     c=a%b;
     System.out.println("Remainder of two numbers: "+c);
    }
}
class Test
{
  public static void main (String[] args){
   C r=new C();
   r.add(); r.sub(); r.multiply(); r.div(); r.rem();
 }
}