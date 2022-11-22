package org.study;

public class Cars extends Vehicles{
	private String Steering;
	private String MusicSystem;
	private String SeatBelt;
	private String AirConditioner;
	private String Fridge;
	private String Esystem;
	
	public Cars(String steering, String musicSystem, String seatBelt, String airConditioner, String fridge,
			String esystem,String engine, String wheels, String seats, String fualTanks, String lights) {
		super(engine,wheels,seats,fualTanks,lights);
		this.Steering = steering;
		this.MusicSystem = musicSystem;
		this.SeatBelt = seatBelt;
		this.AirConditioner = airConditioner;
		this.Fridge = fridge;
		this.Esystem = esystem;
	}

	public String getSteering() {
		return Steering;
	}

	public String getMusicSystem() {
		return MusicSystem;
	}

	public String getSeatBelt() {
		return SeatBelt;
	}

	public String getAirConditioner() {
		return AirConditioner;
	}

	public String getFridge() {
		return Fridge;
	}

	public String getEsystem() {
		return Esystem;
	}

	@Override
	public String toString() {
		return "Cars [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()="
				+ getSeatBelt() + ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEsystem()=" + getEsystem() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFualTanks()=" + getFualTanks() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public void IsEmpty() {
		System.out.println("Not Empty");
	}
	
	
}
