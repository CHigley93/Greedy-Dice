import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Random rand = new Random();
		int die1 = rand.nextInt(6) + 1;
		int die2 = rand.nextInt(6) + 1;
		int die3 = rand.nextInt(6) + 1;
		int die4 = rand.nextInt(6) + 1;
		int die5 = rand.nextInt(6) + 1;
		int die6 = rand.nextInt(6) + 1;
		int score = die1 + die2 + die3 + die4 + die5 + die6;

		Scanner in = new Scanner(System.in);
		int i, rerollNum;

		System.out.println("Your rolls are: " + die1 + " " + die2 + " " + die3 + " " + die4 + " " + die5 + " " + die6);
		System.out.println("Your score is : " + score);
		System.out.println("How many dice would you like to reroll?");

		rerollNum = in.nextInt();
		int reroll[] = new int[rerollNum];

		for (i = 0; i < rerollNum; i++) {
			System.out.println("Enter a die to reroll");
			reroll[i] = in.nextInt();
		}

		System.out.println("You chose to reroll die: " + Arrays.toString(reroll));
		for (i = 0; i < rerollNum; i++) {
			switch (reroll[i]) {
			case 1:
				die1 = rand.nextInt(6) + 1;
				break;
			case 2:
				die2 = rand.nextInt(6) + 1;
				break;
			case 3:
				die3 = rand.nextInt(6) + 1;
				break;
			case 4:
				die4 = rand.nextInt(6) + 1;
				break;
			case 5:
				die5 = rand.nextInt(6) + 1;
				break;
			case 6:
				die6 = rand.nextInt(6) + 1;
				break;
			default:
				System.out.println("That's not an option dummy");
				break;
			}
		}
		score = die1 + die2 + die3 + die4 + die5 + die6;
		System.out.println("Your rolls are: " + die1 + " " + die2 + " " + die3 + " " + die4 + " " + die5 + " " + die6);
		System.out.println("Your score is : " + score);
	}
}
