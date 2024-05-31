package org.gitmalar;

import java.util.LinkedHashMap;
import java.util.Map;

public class charctercount {
	public static void main (String[] args) {
		String v="malar";
		char[] c=v.toCharArray();
		Map<Character,Integer> b=new LinkedHashMap<>();
		for(Character x:c) {
			if(b.containsKey(x)) {
				Integer a=b.get(x);
				b.put(x, a+1);
			}
			else {
				b.put(x, 1);
			}
		}
		System.out.println(b);
	}

}
