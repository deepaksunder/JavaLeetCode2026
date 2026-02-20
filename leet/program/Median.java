package leet.program;

public class Median {
	
	static double findMedian(int[] nums1, int[] nums2) {
		 int len = nums1.length+nums2.length;
	        int[] arr = new int[len];
	        int i = 0, j=0, k = 0;
	        int mid = len/2;
	        double median = 0.0;
	        while(i < nums1.length && j <nums2.length){
	        	if(nums1[i]<nums2[j]) {
	        		arr[k] = nums1[i];
		            i++;
		            k++;
	        	}else {
	        		arr[k] = nums2[j];
		            k++;
		            j++;
	        	}
	            
	        }
	        while(i < nums1.length) {
	        	arr[k] = nums1[i];
	            i++;
	            k++;
	        }
	        while(j <nums2.length) {
	        	arr[k] = nums2[j];
	            k++;
	            j++;
	        }
	        
	        if(len%2 == 0){
	            
	            median = (double)(arr[mid] + arr[mid-1])/2;
	        }else{
	            median = arr[mid];
	        }
	        return median;
	}

	public static void main(String[] args) {
		int[] num1 = {1,3};
		int[] num2 = {2,4};
		System.out.println(findMedian(num1,num2));
	}
}
