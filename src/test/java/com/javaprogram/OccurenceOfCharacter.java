package com.javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String s = "meeran";
	Map<Character,Integer> mp = new LinkedHashMap<>();
	for(int i=0; i<s.length(); i++) {
		char x = s.charAt(i);
		if(mp.containsKey(x)) {
			int a = mp.get(x);
			mp.put(x, a+1);
		}else {   
			mp.put(x, 1);
		}
	}
	System.out.println(mp);


	}

}
