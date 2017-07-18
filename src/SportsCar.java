
public class SportsCar extends Car{

		public SportsCar(String make, String model, String color) {
			super(make, model, color);
		}
		public void acclerate() {
			if (isStarted) {
				if (speed < 80) {
					speed = speed + 8;
				} else if (speed < 85) {
					speed = 85;
					System.out.println("You are now at the speed limit of 85 mph");
				} else {
					System.out.println("You are at the speed limit, it is not proper to go any faster");
				}
			}else {
				System.out.println("Please first start your car");
			}
		}

		public void declerate() {
			if (isStarted) {
				if (speed > 0) {
					speed = speed - 5;
				} else {
					System.out.println("Sorry dude, but braking at 0mph is really dumb");
				}
			}else {
				System.out.println("Please first start your car");
			}
		}

	}
