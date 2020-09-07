package application;

public class Car {
	
	String name = "Car";
	boolean isDomestic;
	
	
	Car(String name)
	{
		this.name = name;
	}
	
	private String vin;
	
	public static String make;
	
	public String model;
	
	private int mileage;
	
	public String getVin()
	{
		return vin;
	}
	
	public void setVin(String carVin)
	{
		this.vin = carVin;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int m)
	{
		this.mileage = m;
	}

	public static void carDetail()
	{
		System.out.println("afafafbab");
	}
	
	
	
}


