package leet.string.pblm;



public class FindTheIndexOf {
	//find the index of fist occurrence of a word in the string
	public static void main(String[] args) {
		
		String haystack = "sadbutsad", needle = "but";
		System.out.println("Index of fist occurance is "+findTheIndexOf(haystack, needle));
	}

	private static int findTheIndexOf(String haystack, String needle) {
		// TODO Auto-generated method stub
		for(int i = 0; i< haystack.length()-needle.length()+1; i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(haystack.substring(i, needle.length()+i).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}

}
