
public class assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=9)
			System.out.println("Please enter 9 integer numbers");
		else {
			int[][] arr=new int[3][3];
			int max=0;
			for(int i=0,k=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(arr[i][j]);
					if(j!=2)
						System.out.print("\t");
				}
				if(i!=2)
					System.out.print("\n");
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(arr[i][j]>max)
						max=arr[i][j];
				}
			}
			System.out.println("\nThe biggest number in the given array is "+max);
		}
	}

}
