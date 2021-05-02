package com.myprograms;

public class ReverseStringRecursion{
	static String temp="";
	public static String reverse(String s){
		if(s.length()==1){
			return s;
		}
		temp = temp +  s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
		//System.out.println(temp);
		return temp;
	}

	public static void main(String args[]){
		String name = "Saishrinivas";
		//System.out.println(name.substring(name.length()-2));
		//System.out.println(name.length());
		System.out.println("reverse string is "+reverse(name));

	}
}