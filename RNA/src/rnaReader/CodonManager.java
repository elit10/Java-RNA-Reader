package rnaReader;

import java.util.*;
import java.math.*;
public class CodonManager 
{
	public HashMap<codonClass,String> codonMap = new HashMap<codonClass, String>();
	
	
	public static void main(String[] args) 
	{
		CodonManager c1 = new CodonManager();
		Scanner sc = new Scanner(System.in);
		
		char[] starChar = {'A','U','G'};
		
		codonClass start = new codonClass(starChar);
		
		while(true)
		{
			String msg = sc.nextLine();
			
			if(msg.equals(""))
			{
				break;
			}
			
			codonClass[] array = c1.Codoninator(msg);
			boolean started = false;
			for(int i = 0; i<array.length; i++)
			{

				if(array[i].isEqual(start))
				{
					System.out.println("this is start codon");
					started = true;
				}
				if(started)
				{
					System.out.println(array[i]);
				}
			}
			
		}
		
	}
	
	public codonClass[] Codoninator(String val)
	{
		int size = (int) Math.floor(val.length()/3);
		codonClass[] array = new codonClass[size];
		for(int i = 0; i<size;i++)
		{
			char[] charArray = new char[3];
			for(int j = 0; j<3; j++)
			{
				charArray[j] = val.charAt((i*3) + j);
			}
			array[i] = new codonClass(charArray);
		}
		
		
		
		
		return array;
	}
}



class codonClass
{
	public char[] code = new char[3];
	
	public codonClass(char[] val) 
	{
		code = val;
	}
	
	public String toString()
	{
		String sum = " Codon : ";
		
		for(char a: code)
		{
			sum = sum + a + ", ";
		}
		
		return sum;
	}
	
	
	public boolean isEqual(codonClass val)
	{
		return (code[0] == val.code[0] && code[1] == val.code[1] && code[2] == val.code[2]);
	}
	
	
	
	
}