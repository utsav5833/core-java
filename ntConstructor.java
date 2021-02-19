class  ConstructorType
{
public  ConstructorType()
	{
		System.out.println("This  is empty ConstructorType");
	}
public  ConstructorType(int a,int b)
	{
		System.out.println("This  is dual int argument ConstructorType"+"  "  +a+  "and  "+b);
	}
public  ConstructorType(double a, double b)
	{
		System.out.println("This  is dual double argument ConstructorType    "+a+  "  and  "+b);
	}
public  ConstructorType(int a, float b)
	{
		System.out.println("This  is int and float argument ConstructorType   "+a+  "  and  "+b);
	}
public  ConstructorType(int a, String b)
	{
		System.out.println("This  is int and String argument ConstructorType    "+a+"   and  "+b);
	}

	}
class launch
{
	public static void main(String[]args)
{
	ConstructorType  d1= new ConstructorType(123,456);
	ConstructorType  d2= new ConstructorType(123,456.7f);
	ConstructorType  d3= new ConstructorType(581216732.323433d,7.83684987683688d  );
	ConstructorType  d4= new ConstructorType(123,"Lamda");
	ConstructorType  d5= new ConstructorType();

	
}
}