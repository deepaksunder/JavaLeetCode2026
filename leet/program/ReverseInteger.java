package leet.program;

public class ReverseInteger {
	
	 public static int reverse(int x) {
		 String va = String.valueOf(x);
		 char[] val = va.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 if(val[0] == '-'){
		     sb.append(val[0]);
		 }
		 for(int i = val.length-1;i>=0;i--){
		     if(val[i] != '-'){
		         sb.append(val[i]);
		     }    
		 }
		 long res = Long.valueOf(sb.isEmpty()?"0":sb.toString());
		 if(res> Integer.MAX_VALUE || res < Integer.MIN_VALUE)
		 {
		     return 0;
		 }
		 return (int)res;
		 

		     }

	  static int revs(int x ) {
		// reversed number
	        long rev = 0;
	        // remainder
	        int rem;

	        while (x != 0) {
	            rem = x % 10;
	            rev = (rev * 10) + rem;
	            x = x / 10;
	            if (rev > Integer.MAX_VALUE-100 || rev < Integer.MIN_VALUE)
	                return 0;
	        }
	        return (int)rev;
	 }
	 public static void main(String[] args) {
		 System.out.println(revs(1534236469));
		
	}
}
