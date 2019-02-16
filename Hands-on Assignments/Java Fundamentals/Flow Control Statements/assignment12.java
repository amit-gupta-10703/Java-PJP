
public class assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int temp=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0)
				temp++;
		}
		if(temp>1)
			System.out.println("Non-prime");
		else
			System.out.println("Prime");
	}

}
