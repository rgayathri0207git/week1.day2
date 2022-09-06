package week1.day2;


public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");

		for (int i = 0; i < split.length-1; i++) {
			int count=1;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count=count+1;
				}

			}
			if(count>1) {
				text=text.replace(split[i], "");
			}
		}
		System.out.println(String.valueOf(text));
	}

}
