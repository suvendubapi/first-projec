class Calculator
{
void add(int a,int b)
{
System.out.println(a);
System.out.println(b);
int sum=a+b;
System.out.println("sum is "+sum);
}
void add(int a,int b,int c)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
int sum=a+b+c;
System.out.println("sum is "+sum);
}
void add(int a,float b)
{
System.out.println(a);
System.out.println(b);
float sum=a+b;
System.out.println("sum is "+sum);
}
public static void main(String[]args)
{
Calculator c=new Calculator();
c.add(10,20);
System.out.println("**************");
c.add(10,20,30);
System.out.println("**************");
c.add(10,10.5f);
}
}
