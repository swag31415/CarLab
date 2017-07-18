
public class SportsCar extends Car{
	public SportsCar(String make, String model, String color) {
		super(make, model, color);
		
	}
	public void acclerate() {
		if (isStarted()) {
			if (getSpeed() < 80) {
				this.setSpeed(this.getSpeed() + 8);
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
				this.setSpeed(this.getSpeed() - 5);
			} else {
				System.out.println("Sorry dude, but braking at 0mph is really dumb");
			}
		}else {
			System.out.println("Please first start your car");
		}
	}

}
