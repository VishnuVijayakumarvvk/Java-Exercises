
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
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	private String car;
	private String door;
	private String speed;
	public String IsRunning() {
		if(car.equals("Honda") && door.equals("Opened") && car.equals("40")) {
			return("Car is running");
		}else if(car.equals("maruthi") && door.equals("Opened") && car.equals("40")) {
			return("Car is going to run");
		}else {
			return("Car is not running");
		}
	}
	

}
