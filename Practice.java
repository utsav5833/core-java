class demo
{
	public void display()
	{
		System.out.println("method 1");
	}
}

class demo1 extends demo
{
	public void display()
	{
		System.out.println("method 2");
	}
}

class demo2 extends demo1
{
	public void display()
	{
		System.out.println("method 3");
	}
}

class launch
{
	demo2 d1= new demo2();
	d1.display();
}