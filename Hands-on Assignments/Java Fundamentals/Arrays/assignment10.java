
public class assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4)
			System.out.println("Please enter 4 integer numbers");
		else {
			int[][] arr=new int[2][2];
			for(int i=0,k=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]);
					if(j==0)
						System.out.print("\t");
				}
				if(i==0)
					System.out.print("\n");
			}
			System.out.print("\n");
			System.out.println("The reverse array is :");
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(arr[i][j]);
					if(j==1)
						System.out.print("\t");
				}
				if(i==1)
					System.out.print("\n");
			}
		}
	}

}
