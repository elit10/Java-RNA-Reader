package rnaReader;

import java.util.*;
import java.math.*;
public class CodonManager 
{
	public HashMap<codonClass,String> codonMap = new HashMap<codonClass, String>();
	
	public CodonManager()
	{
		codonClass start = new codonClass('A','U','G');
		codonClass stop = new codonClass('U','A','A');
		codonClass stop2 = new codonClass('U','A','G');
		codonClass stop3 = new codonClass('U','G','A');
		
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
		codonClass Tyrosine = new codonClass('U','A','U');
		codonClass Tyrosine2 = new codonClass('U','A','C');
		codonClass Tyrosine3 = new codonClass('U','A','C');
		codonClass Histidine = new codonClass('C','A','U');
		codonClass Histidine2 = new codonClass('C','A','C');
		codonClass Glutamine = new codonClass('C','A','A');
		codonClass Glutamine2 = new codonClass('C','A','G');
		codonClass Asparagine = new codonClass('A','A','U');
		codonClass Asparagine2 = new codonClass('A','A','C');
		codonClass Lysine = new codonClass('A','A','A');
		codonClass Lysine2 = new codonClass('A','A','G');
		codonClass AsparticAcid = new codonClass('G','A','U');
		codonClass AsparticAcid2 = new codonClass('G','A','C');
		codonClass GlutamicAcid = new codonClass('G','A','A');
		codonClass GlutamicAcid2 = new codonClass('G','A','G');
		codonClass Cysteine = new codonClass('U','G','U');
		codonClass Cysteine2 = new codonClass('U','G','C');
		codonClass Tryptophan = new codonClass('U','G','G');
		codonClass Arginine = new codonClass('C','G','U');
		codonClass Arginine2 = new codonClass('C','G','C');
		codonClass Arginine3 = new codonClass('C','G','A');
		codonClass Arginine4 = new codonClass('C','G','G');
		codonClass Serine5 = new codonClass('A','G','U');
		codonClass Serine6 = new codonClass('A','G','C');
		codonClass Arginine5 = new codonClass('A','G','A');
		codonClass Arginine6 = new codonClass('A','G','G');
		codonClass Glycine = new codonClass('G','G','U');
		codonClass Glycine2 = new codonClass('G','G','C');
		codonClass Glycine3 = new codonClass('G','G','A');
		codonClass Glycine4 = new codonClass('G','G','G');
		
		codonMap.put(start, "Start");
		codonMap.put(stop, "Stop");
		codonMap.put(stop2, "Stop");
		codonMap.put(Phenylalanine, "Phenylalanine");
		codonMap.put(Phenylalanine2, "Phenylalanine");
		codonMap.put(Leucine, "Leucine");
		codonMap.put(Leucine2, "Leucine");
		codonMap.put(Leucine3, "Leucine");
		codonMap.put(Leucine4, "Leucine");
		codonMap.put(Leucine5, "Leucine");
		codonMap.put(Leucine6, "Leucine");
		codonMap.put(Isoleucine, "Isoleucine");
		codonMap.put(Isoleucine2, "Isoleucine");
		codonMap.put(Isoleucine3, "Isoleucine");
		codonMap.put(Valine, "Valine");
		codonMap.put(Valine2, "Valine");
		codonMap.put(Valine3, "Valine");
		codonMap.put(Valine4, "Valine");
		codonMap.put(Serine, "Serine");
		codonMap.put(Serine2, "Serine");
		codonMap.put(Serine3, "Serine");
		codonMap.put(Serine4, "Serine");
		codonMap.put(Serine5, "Serine");
		codonMap.put(Serine6, "Serine");
		codonMap.put(Proline, "Proline");
		codonMap.put(Proline2, "Proline");
		codonMap.put(Proline3, "Proline");
		codonMap.put(Proline4, "Proline");
		codonMap.put(Threonine, "Threonine");
		codonMap.put(Threonine2, "Threonine");
		codonMap.put(Threonine3, "Threonine");
		codonMap.put(Threonine4, "Threonine");
		codonMap.put(Alanine, "Alanine");
		codonMap.put(Alanine2, "Alanine");
		codonMap.put(Alanine3, "Alanine");
		codonMap.put(Alanine4, "Alanine");
		codonMap.put(Tyrosine, "Tyrosine");
		codonMap.put(Tyrosine2, "Tyrosine");
		codonMap.put(Histidine, "Histidine");
		codonMap.put(Histidine2, "Histidine");
		codonMap.put(Glutamine, "Glutamine");
		codonMap.put(Glutamine2, "Glutamine");
		codonMap.put(Asparagine, "Asparagine");
		codonMap.put(Asparagine2, "Asparagine");
		codonMap.put(Lysine, "Lysine");
		codonMap.put(Lysine2, "Lysine");
		codonMap.put(AsparticAcid, "Aspartic Acid");
		codonMap.put(AsparticAcid2, "Aspartic Acid");
		codonMap.put(GlutamicAcid, "Glutamic Acid");
		codonMap.put(GlutamicAcid2, "Glutamic Acid");
		codonMap.put(Cysteine, "Cysteine");
		codonMap.put(Cysteine2, "Cysteine");
		codonMap.put(Tryptophan, "Tryptophan");
		codonMap.put(Arginine, "Arginine");
		codonMap.put(Arginine2, "Arginine");
		codonMap.put(Arginine3, "Arginine");
		codonMap.put(Arginine4, "Arginine");
		codonMap.put(Arginine5, "Arginine");
		codonMap.put(Arginine6, "Arginine");
		codonMap.put(Glycine, "Glycine");
		codonMap.put(Glycine2, "Glycine");
		codonMap.put(Glycine3, "Glycine");
		codonMap.put(Glycine4, "Glycine");
	}
	
	
	public String Action(String val)
	{
		String toReturn = "";
		codonClass start = new codonClass('A','U','G');
		codonClass stop = new codonClass('U','A','A');
		codonClass stop2 = new codonClass('U','A','G');
		codonClass stop3 = new codonClass('U','G','A');
		codonClass[] array = Codoninator(val);
		boolean started = false;
		
		for(int i = 0; i<array.length; i++)
		{
			for(codonClass c : codonMap.keySet())
			{
				if(c.equals(array[i]))
				{
					//if the codon is in the hashmap
					if(c.equals(start))
					{
						started = true;
					}
					if(started)
					{
						toReturn += " " + codonMap.get(c);
						
						if(codonMap.get(c).equals("Stop"))
						{
							toReturn += " Stopped";
							started = false;
						}
					}
					
					
				}
			}
		}
		return toReturn;
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
	
	
	public boolean equals(codonClass val)
	{
		return (code[0] == val.code[0] && code[1] == val.code[1] && code[2] == val.code[2]);
	}
	
	
	
	
}