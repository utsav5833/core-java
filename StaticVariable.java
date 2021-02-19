class StaticVariable
{
static  int   a=100;
int b=200;

public static void main(String []   args)
{
System.out.println(a);
StaticVariable  obj=new StaticVariable();
System.out.println(obj.b);
obj.b=300;
System.out.println(obj.b);
}
}
class A {
int b=400;
public static void main(String []   args)
{
A  a= new A();
System.out.println(a.b);
System.out.println(StaticVariable.a);
StaticVariable  obj1=new StaticVariable();

System.out.println(obj1.b);

}
}


