import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		List<Car> carList = new ArrayList<Car>();
		System.out.println("Ayy yo main, how many cars u got?");
		int numCars = in.nextInt();
		for (int x = 1; x <= numCars; x++) {
			System.out.println("Gimme a make");
			String make = in.next();
			System.out.println("Gimme a model");
			String model = in.next();
			System.out.println("Gimme a color");
			String color = in.next();
			carList.add(new Car(make, model, color));
		}
		while (true) {
			System.out.println("Here's ur cars dude, choose one to use (type the number of the position)");
			System.out.println(carList);
			int carChosen = in.nextInt();
			carList.get(carChosen - 1).setInUse(true);
			System.out.print("Heyy, cool car. Wanna start it?");
			String willUse = in.next();
			if (willUse.contains("yes")) {
				carList.get(carChosen - 1).setStarted(true);
				System.out.println(
						"cool dude, you started the car, now you can type the following commands" + "\n	acc - acclerate"
								+ "\n	brake - brake" + "\n	stop - stop" + "\n stats - print this car's stats");
				for (int x = 1; x == 1;) {
					String action = in.nextLine();
					if (action.contains("acc") && carList.get(carChosen - 1).getSpeed() <= 85) {
						carList.get(carChosen - 1).acc();
						System.out.println("Yay you sped up by 5 mph");
					} else if (action.contains("acc") && carList.get(carChosen - 1).getSpeed() > 85) {
						carList.get(carChosen - 1).setSpeed(85);
						System.out.println("Sorry dude thats over the speed limit, imma slow you back down");
					}
					if (action.contains("brake") && carList.get(carChosen - 1).getSpeed() > 0) {
						carList.get(carChosen - 1).dec();
						System.out.println("Yay you slowed down by 1mph");
					} else if (action.contains("brake") && carList.get(carChosen - 1).getSpeed() <= 0) {
						System.out.println("Sorry dude, but braking at 0mph is really dumb");
					}
					if (action.contains("stop")) {
						carList.get(carChosen - 1).setStarted(false);
						System.out.println("Cool, you stopped the car and left at home. Back to the beginning");
						x = 2;
					}
					if (action.contains("stats")) {
						System.out.println("Model: " + carList.get(carChosen - 1).getModel() + "\nMake: "
								+ carList.get(carChosen - 1).getMake() + "\nColor: "
								+ carList.get(carChosen - 1).getColor() + "\nSpeed: "
								+ carList.get(carChosen - 1).getSpeed() + "\nis Started? = true" + "\nis in use?  true");
					}
				}

			} else if (willUse.contains("no")) {
				System.out.println("Well thats dumb but ok");
			} else {
				System.out.println("IT WAS A YES OR NO QUESTION DAMMIT, LETS GO BACK TO THE BEGINING");
			}
		}
	}

}
