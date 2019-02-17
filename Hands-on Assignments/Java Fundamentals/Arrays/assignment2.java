
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
		for(int i:arr) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println("Maximum="+max+", Minimum="+min);
	}

}
