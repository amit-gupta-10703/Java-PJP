
public class assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else {
			int num=Integer.parseInt(args[0]);
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++)
					System.out.print("*");
				if(i!=num)
					System.out.print("\n");
			}
		}
	}

}
