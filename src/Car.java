
public class Car {

	// Variable Declarations
	private int speed;
	private String make, model, color;
	private boolean isStarted;
	private boolean isInUse;

	// Constructor
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
		setStarted(false);
		isInUse = false;
		setSpeed(0);
	}

	/**
	 * Business rules: your Car class is currently not enforcing any business
	 * rules whatsoever. As a reminder, an example of a business rule would be:
	 * the car's speed cannot go over 85 mph. TODO: Modify your functions to
	 * follow business rules: A car's speed cannot be negative A car cannot
	 * accelerate unless it's started (see note) A car cannot accelerate past 85
	 * mph A car that's already started cannot be started again A car that's
	 * already stopped cannot be stopped again
	 *
	 * I know that in some ways you feel that you are enforcing the 2nd rule
	 * through the way your CLI works. But that's something you can enforce at
	 * the class level.
	 */

	// <Basic car controls
	// ---------------------------------------------------------------------
	public void acclerate() {
		if (isStarted()) {
			if (getSpeed() < 80) {
				this.setSpeed(this.getSpeed() + 5);
			} else if (getSpeed() < 85) {
				this.setSpeed(85);
				System.out.println("You are now at the speed limit of 85 mph");
			} else {
				System.out.println("You are at the speed limit, it is not proper to go any faster");
			}
		}else {
			System.out.println("Please first start your car");
		}
	}

	public void declerate() {
		if (isStarted()) {
			if (getSpeed() > 0) {
				this.setSpeed(this.getSpeed() - 1);
			} else {
				System.out.println("Sorry dude, but braking at 0mph is really dumb");
			}
		}else {
			System.out.println("Please first start your car");
		}
	}

	public void startCar() {
		if (!isStarted()) {
			this.setStarted(true);
			System.out.println("You started your car!");
		} else {
			System.out.println("You may not start without stopping");
		}
	}

	public void stopCar() {
		if (isStarted()) {
			this.setStarted(false);
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
		System.out.println("Model: " + model + "\nMake: " + make + "\nColor: " + color + "\nSpeed: " + getSpeed()
				+ "\nis Started? : " + isStarted() + "\nis in use? : " + isInUse);
	}

	private boolean isStarted() {
		return isStarted;
	}

	@Override
	public String toString() {
		return model;
	}
}