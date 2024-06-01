package com.javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfWords {

	public static void main(String[] args) {
		String s = "meeran meeran java java code";
	Map<String,Integer> mp = new LinkedHashMap<>();
	String[] s1 = s.split(" ");
	for(String x : s1) {
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
