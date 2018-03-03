package com.competitive;
import java.util.*;

public class CharCount{
	public static void main(String args[]){
	CharCount c  = new CharCount();
	System.out.println("First duplicate character is " + c.firstDupChars());	
}


	public void printCountOfAllChars(){
	//Count of all characters
	String name="saishrinivas";
	Map<Character,Integer> map  = new  HashMap<Character,Integer>();
	char[] nameChar  = name.toCharArray();
	for(int i=0 ; i < nameChar.length ; i++)
	{
		if(map.containsKey(nameChar[i]))
		{
		map.put(nameChar[i],map.get(nameChar[i])+1);
		}
		else
		{
		map.put(nameChar[i],1);
		}
			
	}
	for(Map.Entry<Character,Integer> m : map.entrySet())
	{
	System.out.println(m.getKey()+ " count is "+ m.getValue());
	}

	int maxCount  =  Collections.max(map.values());
	System.out.println(maxCount);
	}

	public char firstDupChars(){
	String name="saiishrinivas";
	Map<Character,Integer> map  = new  HashMap<Character,Integer>();
	char[] nameChar  = name.toCharArray();
	for(int i=0 ; i < nameChar.length ; i++)
	{
		if(map.containsKey(nameChar[i]))
		{
		map.put(nameChar[i],map.get(nameChar[i])+1);
		return nameChar[i];
		}
		else
		{
		map.put(nameChar[i],1);
		}
			
	}
	for(Map.Entry<Character,Integer> m : map.entrySet())
	{
	System.out.println(m.getKey()+ " count is "+ m.getValue());
	}
	return 'c';
	}
}
