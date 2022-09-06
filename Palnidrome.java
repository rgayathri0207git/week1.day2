package week1.day2;

public class Palnidrome {

	public static void main(String[] args) {
		String s1="Madam";
		String s2="";
		char[] charArray = s1.toCharArray();



		for (int i =charArray.length-1 ; i>=0; i--) {

			s2=s2.concat(String.valueOf(charArray[i]));
		}

		if(s1.equalsIgnoreCase(s2)) {
			System.out.println(s1+ " is Palindrome");	
		}else {
			System.out.println(s1+ " is not Palindrome");
		}

	}

}
