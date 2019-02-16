
public class assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int temp=0;
		while(num%10!=0) {
			temp=temp+(num%10);
			num=num/10;
		}
		System.out.println(temp);
	}

}
