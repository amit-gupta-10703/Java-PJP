import java.util.Arrays;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,12,45,67,89};
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++) {
			if(i!=arr.length-1) {
				if(arr[i]!=arr[i+1])
					System.out.println(arr[i]);
			}
			else
				System.out.println(arr[i]);
		}
	}

}
