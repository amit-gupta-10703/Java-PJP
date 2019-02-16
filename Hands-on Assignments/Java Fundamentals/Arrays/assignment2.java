
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum="+max+", Minimum="+min);
	}

}
