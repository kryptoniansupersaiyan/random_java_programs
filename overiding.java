class Test1
{
 static void main(String arg[])
{
A a=new A();
a.display();
B b=new B();
b.display();
} }
class A
{
protected void display()
{
System.out.println("Hai");
} }
class B extends A
{
 void display()
{
System.out.println("Hello"); } }
