
public class assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else {
			int num=Integer.parseInt(args[0]);
			if(num==1)
				System.out.println("1 is neither prime nor composite");
			else if(num==0)
				System.out.println("0 is neither prime nor composite");
			else {
				int temp=0;
				for(int i=2;i<=num;i++) {
					if(num%i==0)
						temp++;
				}
				if(temp>1)
					System.out.println(num+" is not a prime number");
				else
					System.out.println(num+" is a prime number");
			}
		}
	}

}
