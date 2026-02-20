package leet.program;

public class Palindrome {
	
	static String palindromeTest(String str) {
		int i=0,j=str.length()-1, st=0,ed=0;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {				
				st=i;
				ed=j;
			}
			i++;
			j--;
		}
		
		return str.substring(st, ed+1);
	}
	
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		System.out.println(palindromeTest(str));
	}

}
