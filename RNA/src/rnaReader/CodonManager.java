package rnaReader;

import java.util.*;
import java.math.*;
public class CodonManager 
{
	public HashMap<codonClass,String> codonMap = new HashMap<codonClass, String>();
	
	public void initHashMap()
	{
		codonClass start = new codonClass('A','U','G');
		codonClass stop = new codonClass('U','A','A');
		codonClass stop2 = new codonClass('U','A','G');
		codonClass Phenylalanine = new codonClass('U','U','U');
		codonClass Phenylalanine2 = new codonClass('U','U','C');
		codonClass Leucine = new codonClass('U','C','A');
		codonClass Leucine2 = new codonClass('U','U','G');
		codonClass Leucine3 = new codonClass('C','U','U');
		codonClass Leucine4 = new codonClass('C','U','C');
		codonClass Leucine5 = new codonClass('C','U','A');
		codonClass Leucine6 = new codonClass('C','U','G');
		codonClass Isoleucine = new codonClass('A','U','U');
		codonClass Isoleucine2 = new codonClass('A','U','C');
		codonClass Isoleucine3 = new codonClass('A','U','A');
		codonClass Valine = new codonClass('G','U','U');
		codonClass Valine2 = new codonClass('G','U','C');
		codonClass Valine3 = new codonClass('G','U','A');
		codonClass Valine4 = new codonClass('G','U','G');
		codonClass Serine = new codonClass('U','C','U');
		codonClass Serine2 = new codonClass('U','C','C');
		codonClass Serine3 = new codonClass('U','C','A');
		codonClass Serine4 = new codonClass('U','C','G');
		codonClass Proline = new codonClass('C','C','U');
		codonClass Proline2 = new codonClass('C','C','C');
		codonClass Proline3 = new codonClass('C','C','A');
		codonClass Proline4 = new codonClass('C','C','G');
		codonClass Threonine = new codonClass('A','C','U');
		codonClass Threonine2 = new codonClass('A','C','C');
		codonClass Threonine3 = new codonClass('A','C','A');
		codonClass Threonine4 = new codonClass('A','C','G');
		codonClass Alanine = new codonClass('G','C','U');
		codonClass Alanine2 = new codonClass('G','C','C');
		codonClass Alanine3 = new codonClass('G','C','A');
		codonClass Alanine4 = new codonClass('G','C','G');
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		CodonManager c1 = new CodonManager();
		Scanner sc = new Scanner(System.in);
		

		
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
			array[i] = new codonClass(charArray[0],charArray[1],charArray[2]);
		}
		
		
		
		
		return array;
	}
}



class codonClass
{
	public char[] code = new char[3];
	
	public codonClass(char v1,char v2,char v3) 
	{
		code[0] = v1;
		code[1] = v2;
		code[2] = v3;
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