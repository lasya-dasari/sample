package javabasic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Primeno_Finding
{
  public static boolean isprime=true;
  
	public static void Primeno(int num)
	{
		for(int i=2; i<=num/2;i++)
		{
			if((num%2)==0)
			{
				isprime=false;
			}
		}
		
		if(isprime)
		{
			System.out.println("Given no is palindrome " +num);
		}
			else
			{
				System.out.println("given no is not palindrome " +num);
			
		}
	}
	
	
	public static void factorial(int no)
	{
		int fact=1;
		for(int i=1 ;i<=no; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial number " +no + " is  " + fact );
	}
	
	public static void Fibonacci(int num)
	{
		int n1=0; int n2=1;
		int n3;
		System.out.print(n1+" "+n2 );

		for(int i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
	public static void palindrome_string(String name)
	{
		String reverse="";
	 	for(int i=name.length()-1; i>=0; i--)
	 	{
	 		reverse=reverse+name.charAt(i);
	 	}
	 	if(name.equals(reverse))
	 	
	 		
	 	System.out.println( "given name is palindrome");
	 	
	 	else 
	 		System.out.println("given name is not palindrome");
	 	
	}
	
	public static void armstrong(int num)
	{
		int temp,a,c=0;
		temp=num;
	    while(num>0)
	    {
	    	a=num%10;
	    	num=num/10;
	    	c=c+(a*a*a);
	    }
	    if(temp==c)
	    System.out.println("armstrong no");
	    else
	    	System.out.println("not armstrong no");
	    	
	 	
	}
	
	public static void second_largestno()
	{
		int a[]= {2,7,4,8,10,6};
		Arrays.sort(a);
		int total=a.length-2;
		System.out.println("2nd largest no " +a[total] );
	}
	
	public static void list()
	{
	   List<Object>  list=new ArrayList<Object>();
	   list.add("sandhya");
	   list.add(2);
	   list.add("sandhya");
	   list.add("9949297951");
	   list.add(1,"divya");
	   list.remove("sandhya");
	   System.out.println(list);
	   System.out.println(list.size());
	   System.out.println(list.get(2));
	  
	   
	}
	
	public static void Remove_duplicates()
	{
		List<Object>  list=new ArrayList<Object>();
		   list.add("1");
		   list.add(2);
		   list.add("3");
		   list.add("4");
		   list.add(1,"5");
		   list.add("4");
		   list.add("3");
		   list.add("2");
		   
		   System.out.println("Before dublicates removing values"  +list);
		 
		   Set<Object> set=new HashSet<Object>();
		   set.addAll(list);
		 
		  
		   System.out.println(set);
	}

}
