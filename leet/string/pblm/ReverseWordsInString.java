package leet.string.pblm;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		String s = " the sky  is   blue";
		System.out.println("The reversed string is "+reverseWord(s));
	}

	private static String reverseWord(String s) {
		// TODO Auto-generated method stub
		String str = s.trim();
		String[] words = str.split(" +");//split based on multiple spaces
		StringBuilder sb = new StringBuilder();
		for(int i = words.length-1; i >= 0; i-- ) {
			sb.append(words[i]).append(" ");
		}
		return sb.toString();
	}

}
