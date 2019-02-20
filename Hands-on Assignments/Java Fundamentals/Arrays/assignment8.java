import java.util.Arrays;

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,30,40,100,99};
		Arrays.sort(arr);
		int max=1;
		int temp=arr[0];
        int curr=1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]==arr[i-1])
                curr++;
            else {
                if(curr>max) {
                    max=curr;
                    temp=arr[i-1];
                }
                curr=1;
            }
        }
        if(curr>max) {
            max=curr;
            temp=arr[arr.length-1];
        }
        System.out.println(temp);
	}

}
