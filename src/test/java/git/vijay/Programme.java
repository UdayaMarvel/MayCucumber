package git.vijay;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Programme {
public static void main(String[] args) {

		
		String s = "viijay";
		String s1 = "";
		Map<Character,Integer> mp = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			mp.put(a,1);
		}
		Set<Character> b = mp.keySet();
		for(char c : b) {
			s1=s1+c;
		}
		System.out.println(s1);
	


}}


