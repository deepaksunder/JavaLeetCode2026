package leet.sliding.window;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		int start = 0, end = 0, max_len = 0;
		List<Character> subList = new ArrayList();
		while(end < s.length()) {
			if( !subList.contains(s.charAt(end))) {
				subList.add(s.charAt(end));
				end++;
				max_len = Math.max(subList.size(), max_len);
			}else {
				System.out.println(s.charAt(start));
				subList.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
		System.out.println("Max length of non repeating sub string is "+max_len);
	}

}
