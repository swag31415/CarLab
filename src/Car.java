
public class Car {
	
	int speed;
	String make, model, color;
	boolean isStarted, isInUse;
	
	public Car(String make,String model,String color) {
		this.make = make;
		this.model = model;
		this.color = color;
		isStarted = false;
		isInUse = false;
	}

	public int getSpeed() {
		return speed;
	}

	public void acc() {
		this.speed+=5;
	}
	
	public void dec() {
		this.speed-=1;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	public boolean isInUse() {
		return isInUse;
	}

	public void setInUse(boolean isInUse) {
		this.isInUse = isInUse;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return model;
	}
}
