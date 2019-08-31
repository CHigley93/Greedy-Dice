import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static Integer get_dice_num(String input, Scanner ins, Boolean zeroes) {
		try {
			int result = Integer.parseInt(input);
			if(zeroes) {
				if(result < 0 || result > 6) {
					throw new IllegalArgumentException();
				}
			}
			else if(result < 1 || result > 6) {
				throw new IllegalArgumentException();
			}
			return result;
		}
		catch(Exception e) {
			if(zeroes) {
				System.out.println("You must enter a number 0-6");
			}
			else {
				System.out.println("You must enter a number 1-6");
			}
			return get_dice_num(ins.nextLine(), ins, zeroes);
		}
	}

	
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int dice[] = new int[6];
		int i, j, rerollNum, score = 0;

		for (i = 0; i < dice.length; i++) {
			dice[i] = rand.nextInt(6) + 1;
			score += dice[i];
		}
		System.out.println("Your rolls are: " + Arrays.toString(dice));
		System.out.println("Your score is : " + score);

		for (j = 0; j < 3; j++) {
			
			System.out.println("How many dice would you like to reroll?");
			rerollNum = get_dice_num(in.nextLine(), in, true);
			if(rerollNum == 0) {
				break;
			}
			int reroll[] = new int[rerollNum];
			

			for (i = 0; i < rerollNum; i++) {
				System.out.println("Enter a die to reroll");
				reroll[i] = get_dice_num(in.nextLine(), in, false);
			}

			System.out.println("You chose to reroll dice: " + Arrays.toString(reroll));
			for (i = 0; i < rerollNum; i++) {
				dice[reroll[i] - 1] = rand.nextInt(6) + 1;
			}
			score = 0;
			for (i = 0; i < dice.length; i++) {
				score += dice[i];
			}
			System.out.println("Your rolls are: " + Arrays.toString(dice));
			System.out.println("Your score is : " + score);
		}
		System.out.println("Your final score is:" + score);
	}
}
