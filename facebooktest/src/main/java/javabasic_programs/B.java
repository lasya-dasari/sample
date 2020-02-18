package javabasic_programs;

public class B extends A 
{
	
	public void a1()
	{
		System.out.println("subclass a1 method executed ");
	}

	public void a2()
	{
		System.out.println("subclass a2 method executed ");
	}

	public static void main(String[] args) {
		 
		//A a=new A();
		A a=new B();
		//a.a1();
		a.a2();
		a.c1();

	}


}