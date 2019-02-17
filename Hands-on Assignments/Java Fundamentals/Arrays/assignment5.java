import java.util.Arrays;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		Arrays.sort(arr);
		System.out.println("Largest="+arr[arr.length-1]+","+arr[arr.length-2]);
		System.out.println("Smallest="+arr[0]+","+arr[1]);
	}

}
