package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
			long chassisNumber = 12345671800167015l;
			boolean isPunctured = false;
	String bikeName = "Royal Enfield";
			double runningKM = 15.50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler myBike = new TwoWheeler();
		System.out.println(myBike.noOfWheels);
		System.out.println(myBike.noOfMirrors);
		System.out.println(myBike.chassisNumber);
		System.out.println(myBike.isPunctured);
		System.out.println(myBike.bikeName);
		System.out.println(myBike.runningKM);

	}

}
