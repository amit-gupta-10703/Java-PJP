
public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var='1';
		if(Character.isAlphabetic(var))
			System.out.println("Alphabet");
		else if(Character.isDigit(var))
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

}
