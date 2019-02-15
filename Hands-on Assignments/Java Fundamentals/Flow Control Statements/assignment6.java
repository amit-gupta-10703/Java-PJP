
public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("Female")) {
			if((age>=1) && (age<=58))
				System.out.println("8.2%");
			else if((age>=59) && (age<=100))
				System.out.println("9.2%");
		}
		else {
			if((age>=1) && (age<=58))
				System.out.println("8.4%");
			else if((age>=59) && (age<=100))
				System.out.println("10.5%");
		}
	}

}
