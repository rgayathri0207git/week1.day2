package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				System.out.print(String.valueOf(charArray[i]).toUpperCase());
			}else {
				System.out.print(charArray[i]);
			}
		}
	}
}

