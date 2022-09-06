package week1.day2;

public class ReverseEvenPositionWords {

	public static void main(String[] args) {
		String s = "I am a software engineer";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(i%2!=0) {
				char[] charArray = str[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);

				}
			}
			else {
				System.out.print(" "+str[i]+" ");
			}
		}


	}



}



