
public class Car {

	// Variable Declarations
	protected int speed;
	private String make, model, color;
	protected boolean isStarted;
	protected boolean isInUse;

	// Constructor
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
		isStarted = false;
		isInUse = false;
		speed = 0;
	}

	// <Basic car controls
	// ---------------------------------------------------------------------
	public void acclerate() {
		int acclerationUnit = 5;
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
		int declerationUnit = 1;
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

	public void startCar() {
		if (!isStarted()) {
			this.isStarted = true;
			System.out.println("You started your car!");
		} else {
			System.out.println("You may not start without stopping");
		}
	}

	public void stopCar() {
		if (isStarted()) {
			this.isStarted = false;
			System.out.println("You stopped your car!");
		} else {
			System.out.println("You may not stop without starting");
		}
	}

	// </Basic car controls
	// ---------------------------------------------------------------------

	public void setInUse() {
		if (!isInUse) {
			this.isInUse = true;
		}
	}

	public boolean isInUse() {
		return isInUse;
	}

	public void setNotInUse() {
		if (isInUse) {
			this.isInUse = false;
		}
	}

	public void getStats() {
		System.out.println("Model: " + model + "\nMake: " + make + "\nColor: " + color + "\nSpeed: " + speed
				+ "\nis Started? : " + isStarted + "\nis in use? : " + isInUse);
	}

	private boolean isStarted() {
		return isStarted;
	}

	@Override
	public String toString() {
		return model;
	}

}
