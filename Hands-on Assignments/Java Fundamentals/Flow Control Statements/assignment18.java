
public class assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int temp1;
		int temp2=0;
		int temp3=num;
		while(num!=0) {
			temp1=num%10;
			temp2=temp2*10+temp1;
			num=num/10;
		}
		if(temp2==temp3)
			System.out.println(temp3+" is a palindrome");
		else
			System.out.println(temp3+" is not a palindrome");
	}

}
