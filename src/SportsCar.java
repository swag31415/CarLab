
public class SportsCar extends Car {

	public SportsCar(String make, String model, String color) {
		super(make, model, color);
	}

	public void acclerate() {
		int acclerationUnit = 8;
		int speedLimit = 85;
		if (isStarted) {
			if (speed < speedLimit - acclerationUnit) {
				speed = speed + acclerationUnit;
			} else if (speed < speedLimit) {
				speed = speedLimit;
				System.out.println("You are now at the speed limit of 85 mph");
			} else {
				System.out.println("You are at the speed limit, it is not proper to go any faster");
			}
		} else {
			System.out.println("Please first start your car");
		}
	}

	public void declerate() {
		int declerationUnit = 5;
		if (isStarted) {
			if (speed >= declerationUnit) {
				speed = speed - declerationUnit;
			} else if (speed > 0) {
				speed = 0;
				System.out.println("You are now at 0mph!");
			} else {
				System.out.println("You are attempting to brake at 0mph, that's not right!");
			}
		} else {
			System.out.println("Please first start your car");
		}
	}

}
