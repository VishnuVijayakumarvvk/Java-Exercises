package javasecond;

public class Cars {
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	private String car;
	private String door;
	private int speed;
	
	public String IsCarOn() {
		if(car.equals("Honda") && door.equals("Open") && speed>0) {
			return("Car is running");
		}else {
			return("Car not running");
		}
	}

}
