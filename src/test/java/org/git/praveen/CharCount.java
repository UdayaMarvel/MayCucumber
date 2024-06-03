package org.git.praveen;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
	
public static void main(String[] args) {
		
		String str = "Ramesh is a good man";
		char[] arr =  str.toCharArray();
		 String str1 = "";
		 Map<Character, Integer> mp =  new LinkedHashMap<>();
		 for(Character x : arr) {
			 if(mp.containsKey(x)) {
				 mp.put(x, mp.get(x)+1);
			 }
			 else {
				 mp.put(x, 1);
			 }
		 }
		 for(Character x : mp.keySet()) {
			 if(x!=' ') {
				 str1 = str1 + x + mp.get(x);
			 }
		 }
		System.out.println(str1);
	}

}
