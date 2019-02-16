
public class assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			int temp=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0)
					temp++;
			}
			if(temp==1)
				System.out.println(i);
		}
	}

}
