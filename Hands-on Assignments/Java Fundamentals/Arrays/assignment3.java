
public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,34,56,7};
		int num=Integer.parseInt(args[0]);
		int temp=-1;
		int position=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				temp=1;
				position=i+1;
			}
		}
		if(temp==1)
			System.out.println(position);
		else
			System.out.println(temp);
	}

}
