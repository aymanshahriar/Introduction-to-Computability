import java.util.Scanner;

// This program takes a string as input and returns the number of letters
public class NumLetters {


	public static void main(String[] args) {
		// takes input
		System.out.println("Enter a word");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		
		int count = 0;
		while (word.length() != 0) {
			// remove the first character from word
			word = word.substring(1);
			count++;
		}
		System.out.println(count);

	}









}
