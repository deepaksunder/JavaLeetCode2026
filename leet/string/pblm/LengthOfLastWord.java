package leet.string.pblm;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String str = " fly way boy to moon ";
		System.out.println("The last word length is "+lengthOfLastword(str));
		
	}
	
	static int lengthOfLastword(String s) {
		String str = s.trim();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>0;i--) {
			if(str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
				count++;
			}else {
				break;
			}
		}
		sb.reverse();
		System.out.println("The last word is "+sb.toString());
		return count;
	}
}
