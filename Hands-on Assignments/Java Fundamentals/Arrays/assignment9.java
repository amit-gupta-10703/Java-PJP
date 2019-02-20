
public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,6,4,7,9};
		int sum=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6)
				temp=1;
			else if(arr[i]==7) {
					temp=0;
					i++;
			}
			if(temp!=1)
				sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
