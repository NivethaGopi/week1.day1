package week1.day1;

public class Car {
	public void applyBreak()
	{
		System.out.println("Break is applied");
	}

	public void applyGear()
{
	System.out.println("Apply the Gear");
}

	public void switchonAc()
{
	System.out.println("Please Switch on the AC");
}

	public void applyAcclerate()
	{
		System.out.println("Apply the Accelerate");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchonAc();
		myCar.applyAcclerate();

	}

}
