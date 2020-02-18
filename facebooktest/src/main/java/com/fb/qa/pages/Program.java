package com.fb.qa.pages;

import java.util.HashMap;
import java.util.Iterator;



public class Program {

	public static void main(String[] args) {
		String n="sandhya"; 
		char c[]=n.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0; i<c.length; i++)
		{
			if(map.get(c[i])!=null)
			{
			map.put(c[i], map.get(c[i])+1 );
			}
			else
			{
				map.put(c[i], 1);
			}
			
		}
		
		System.out.println(map);
		 
		Iterator<Character> temp=map.keySet().iterator();
		while(temp.hasNext())
		{
			char tempc=temp.next();
			if(map.get(tempc)>1)
			{
				System.out.println("  the char " +  tempc   +            "   Appered    "+   map.get(tempc)  + "  no.of times  ");
			}
		}
		
	}
}
