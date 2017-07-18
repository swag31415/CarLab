import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

//	public static String userStringInput(String inputText) {
//		System.out.println(inputText);
//		return (new Scanner(System.in).nextLine());
//	}
//	public static int userIntInput(String inputText) {
//		int i=0;
//		System.out.println(inputText);
//	    Scanner scanner = new Scanner(System.in);
//	    while (!scanner.hasNextInt()){
//	        System.out.println("Please enter a number:");
//	        scanner.nextLine();
//	    }
//	    i = scanner.nextInt();
//	    scanner.close();
//	    return i;
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> carList = new ArrayList<Car>();
		System.out.println("Ayy yo main, how many cars u got?");
		int numCars = scanner.nextInt();
		for (int x = 1; x <= numCars; x++) {
			System.out.println("Gimme a make for car " + x);
			String make = scanner.nextLine();
			System.out.println("Gimme a model for car " + x);
			String model = scanner.nextLine();
			System.out.println("Gimme a color for car " + x);
			String color = scanner.nextLine();
			carList.add(new Car(make, model, color));
			System.out.println("Good job we did car " + x);
		}
		while (true) {
			/*
			 * First big note is that the UX or "User Experience" of your
			 * program is not great. You're probably familiar with this term in
			 * general, but if not, what it means is: how easy or hard is your
			 * program to use? Is the interface with the program intuitive? Is
			 * the user able to easily navigate menus? In short, what is the
			 * _experience_ of the _user_ - are they frustrated and struggling
			 * to use your program, or is it easy or even fun to use? UX matters
			 * a *lot* out in the real world (one of the reasons for Apple's
			 * success is that they have arguably some of the best UX people in
			 * the world working for them).
			 * 
			 * When writing apps for learning assignments the UX matters a lot
			 * less of course. But you should still try to think about it
			 * somewhat. So for example this output isn't great:
			 * 
			 * Heyy, cool car. Wanna start it?Yes IT WAS A YES OR NO QUESTION
			 * DAMMIT, LETS GO BACK TO THE BEGINING
			 * 
			 * Even when you're writing a CLI (Command Line Interface) App, you
			 * can think about the user experience. In this case, there are a
			 * few things you could do to make this better.
			 * 
			 * TODO 1: Use string.toLowerCase() or .compareToIgnoreCase() to fix
			 * the case issue (So "Yes" or "yes" will both work. I think the
			 * best method looks like this: String userInput =
			 * inputScanner.next().toLowerCase(); if
			 * (userInputScanner.contains("y") { //Answer is no } else if
			 * (userInputScanner.contains("n") { //Answer is yes } else {
			 * System.out.println("Could not understand response"); } TODO 2:
			 * Whatever you decide on a method above, communicate the format to
			 * the user:
			 * 
			 * System.out.
			 * print("Heyy, cool car. Wanna start it? ('yes' or 'no')");
			 * 
			 */

			System.out.println("Here's ur cars dude, choose one to use (type the number of the position)");
			System.out.println(carList);
			int carChosenIndex = scanner.nextInt();
			Car carChosen = carList.get(carChosenIndex - 1);
			// carChosen.setInUse(true);
			// System.out.print("Heyy, cool car. Wanna start it?");
			// String willUse = userInputScanner.next();
			// if (willUse.contains("yes")) {
			// carChosen.setStarted(true);
			// System.out.println(
			// "cool dude, you started the car, now you can type the following
			// commands" + "\n acc - acclerate"
			// + "\n brake - brake" + "\n stop - stop" + "\n stats - print this
			// car's stats");
			// for (int x = 1; x == 1;) {
			// String action = userInputScanner.nextLine();
			// if (action.contains("acc") && carChosen.getSpeed() <= 85) {
			// carChosen.acc();
			// System.out.println("Yay you sped up by 5 mph");
			// } else if (action.contains("acc") && carChosen.getSpeed() > 85) {
			// carChosen.setSpeed(85);
			// System.out.println("Sorry dude thats over the speed limit, imma
			// slow you back down");
			// }
			// if (action.contains("brake") && carChosen.getSpeed() > 0) {
			// carChosen.dec();
			// System.out.println("Yay you slowed down by 1mph");
			// } else if (action.contains("brake") && carChosen.getSpeed() <= 0)
			// {
			// System.out.println("Sorry dude, but braking at 0mph is really
			// dumb");
			// }
			// if (action.contains("stop")) {
			// carChosen.setStarted(false);
			// System.out.println("Cool, you stopped the car and left at home.
			// Back to the beginning");
			// x = 2;
			// }
			// if (action.contains("stats")) {
			// System.out.println("Model: " + carChosen.getModel() + "\nMake: "
			// + carChosen.getMake() + "\nColor: "
			// + carChosen.getColor() + "\nSpeed: "
			// + carChosen.getSpeed() + "\nis Started? = true" + "\nis in use?
			// true");
			// }
			// }
			//
			// } else if (willUse.contains("no")) {
			// System.out.println("Well thats dumb but ok");
			// } else {
			// System.out.println("IT WAS A YES OR NO QUESTION DAMMIT, LETS GO
			// BACK TO THE BEGINING");
			// }
		}
	}

}