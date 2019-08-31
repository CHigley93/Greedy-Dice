import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
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

			do {
			System.out.println("How many dice would you like to reroll?");
			rerollNum = in.nextInt();
			if(rerollNum == 0) {
				break;
			}
			else if(rerollNum > 6 || rerollNum < 0){
				System.out.println("You can't reroll that many dice");
			}
			}
			while(rerollNum <=6);
			int reroll[] = new int[rerollNum];
			

			for (i = 0; i < rerollNum; i++) {
				System.out.println("Enter a die to reroll");
				reroll[i] = in.nextInt();
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
