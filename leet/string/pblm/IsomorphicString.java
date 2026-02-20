package leet.string.pblm;

import java.util.HashMap;

public class IsomorphicString {
	
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println("Is s %s and t %s are isomorphic "+isIsomorphic(s,t));
	}
	
	static boolean isIsomorphic(String s, String t) {
	
		HashMap<Character, Character> hm = new HashMap();
		for(int i=0; i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				if(!hm.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			}else {
				if(hm.containsValue(t.charAt(i))) {
					return false;
				}
				hm.put(s.charAt(i), t.charAt(i));
			}
		}
		
		return true;
	}
}
