package com.competitive.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramHackerRant {
	static List<String> anagaram = Arrays.asList("code", "doec", "ecdo", "farm", "marf");

	public static void main(String args[]) {
		System.out.println(getArr(anagaram));
		
	}
	
	public static List<String> getArr(List<String> anagaram){
		List<String> anagaramreturn = new ArrayList<String>();
		anagaramreturn.add(anagaram.get(0));
		for(int i = 0 ;i<anagaram.size()-1;i++) {
			if(!isAnagram(anagaram.get(i), anagaram.get(i+1))){
				anagaramreturn.add(anagaram.get(i+1));
			}
		}
		return anagaramreturn;
	}
	
	public static boolean isAnagram(String one, String two) {
		boolean isAnagram = true;
		char[] onearr = one.toCharArray();
		char[] twoarr = two.toCharArray();
		Map<Character, Integer> mapone = new HashMap<Character, Integer>();
		Map<Character, Integer> maptwo = new HashMap<Character, Integer>();
		
		for(char a : onearr) {
			if(mapone.containsKey(a)) {
				mapone.put(a, mapone.get(a)+1);
			}else {
				mapone.put(a, 1);
			}
		}
		
		for(char a : twoarr) {
			if(maptwo.containsKey(a)) {
				maptwo.put(a, maptwo.get(a)+1);
			}else {
				maptwo.put(a, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> set : mapone.entrySet()) {
			if(maptwo.containsKey(set.getKey())) {
				if(maptwo.get(set.getKey()) == set.getValue()) {
					
				}else {
					isAnagram = false;
					return isAnagram;
				}
			}else {
				isAnagram = false;
				return isAnagram;
			}
		}
		return isAnagram;
	}
}
