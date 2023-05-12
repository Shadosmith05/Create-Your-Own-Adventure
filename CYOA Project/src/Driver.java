import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		
		String play = "yes";
		
		while (play.equals("yes")) {
			System.out.println("What is your name?");
			String name = inputStr.nextLine();
			Story game = new Story(name);
			
			System.out.println("One day " + name + " decides to go on an adventure down to the local river on the edge of town.");
			
			System.out.println(game.scene1());
			
			int choice = inputNum.nextInt();
			
			if (choice == 1) {
				System.out.println(game.s1Out1());
				
				choice = inputNum.nextInt();
				
				if (choice == 1) {
					System.out.println(game.s2Out1());
				} else if (choice == 2) {
					System.out.println(game.s2Out2());
				} else if (choice == 3) {
					System.out.println(game.s2Out3());
				} else {
					System.out.println(game.s2Out4());
				}
			} else if (choice == 2) {
				System.out.println(game.s1Out2());
			} else if (choice == 3) {
				System.out.println(game.s1Out3());
			} else {
				System.out.println(game.s1Out4());
			}
			
			System.out.println("Do you want to play again? (yes/no)");
			play = inputStr.nextLine();
		}
		
		inputStr.close();
		inputNum.close();
	}
}
