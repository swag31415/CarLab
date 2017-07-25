
// Author: Swag31415 | Garage Handler Program

//input all the things!
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main2 {

	@SuppressWarnings({ "finally", "resource" }) // Java wanted this idk why
	public static String userStringInput(String userInputText) { // String input
																	// with
																	// decent
																	// error
																	// control
		System.out.println(userInputText);
		String returnValue = "";
		try {
			returnValue = new Scanner(System.in).nextLine();
		} catch (NoSuchElementException ex) {
			return userStringInput(userInputText);
		} finally {
			return returnValue;
		}
	}

	@SuppressWarnings("resource")
	public static boolean userYesNoInput(String userInputText) { // Very likable
																	// boolean
																	// input
		System.out.println(userInputText);
		boolean returnBoolean = false;
		String userInput = "";
		try {
			userInput = new Scanner(System.in).next().toLowerCase();
			if (userInput.contains("y")) {
				returnBoolean = true;
			} else if (userInput.contains("n")) {
				returnBoolean = false;
			} else {
				System.out.println("Sorry but we wee expecting a yes or no answer, Please try again");
				return userYesNoInput(userInputText);
			}
		} catch (NoSuchElementException ex) {
			return userYesNoInput(userInputText);
		}
		return returnBoolean;
	}

	@SuppressWarnings("resource") // Java wanted this idk why
	public static int userIntInput(String userInputText) { // Int input with
															// decent error
															// control
		System.out.println(userInputText);
		int returnInt = 0;
		try {
			returnInt = new Scanner(System.in).nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Sorry we want numerical input, please try again");
			return userIntInput(userInputText);
		}
		return returnInt;
	}// Implemented the try/catch thing

	public static void main(String args[]) {// the actual main
		List<Car> carList = new ArrayList<Car>();// making the carList or
													// "garage"

		int numOfCars = userIntInput("How many cars do you own?");

		for (int x = 1; x <= numOfCars; x++) {// getting details on all the cars

			String make = userStringInput("Please provide a make for car " + x);
			String model = userStringInput("Please provide a model for car " + x);
			String color = userStringInput("Please provide a color for car " + x);
			boolean isSportsCar = userYesNoInput("Is this car a sportscar?");
			if (isSportsCar) {
				carList.add(new SportsCar(make, model, color));
			} else {
				carList.add(new Car(make, model, color));
			}
			System.out.println("Good job we did car " + x);
		}

		while (true) { // beginning to actually do things to cars
			// Getting some info out
			System.out.println("Here are your cars! please choose a car to use \n(Type the number of the position)");
			System.out.println(carList);
			// getting the car in use
			int carChosenIndex = userIntInput("");
			Car carChosen = carList.get(carChosenIndex - 1);
			carChosen.setInUse();

			// starting the car usage experience
			System.out.println("Yay! here are the current stats of your car");
			carChosen.getStats();
			System.out.println("You can now try to start, stop, accelerate, decelrate, or get the stats of your car");
			System.out.println("The correct way to do all that is just by typing these words");
			while (carChosen.isInUse()) {
				String userCommand = userStringInput("(start, stop, acc, dec, stats)");
				if (userCommand.equals("start")) {
					carChosen.startCar();
				} else if (userCommand.equals("stop")) {
					carChosen.stopCar();
					boolean willUse = userYesNoInput("Would you like to keep using this car? (y/n)");
					if (!willUse) {
						carChosen.setNotInUse();// Stops the while here
					}
				} else if (userCommand.equals("acc")) {
					carChosen.acclerate();
				} else if (userCommand.equals("dec")) {
					carChosen.declerate();
				} else if (userCommand.equals("stats")) {
					carChosen.getStats();
				}
			}
		}
	}
}
