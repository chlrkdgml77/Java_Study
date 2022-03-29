package ME_02;

public class Instanceof {
	public static void main(String[] args) {
		Ex01Car car = new Ex01Car();
		Ex01FireCar fe = new Ex01FireCar();
		
		if (fe instanceof Ex01FireCar) {
			System.out.println("FireCar OK");
		}
		if (fe instanceof Ex01Car) {
			System.out.println("Car OK");
		}
		
		if (car instanceof Ex01FireCar) {
			System.out.println("FireCar OK");
		}
		else {
			System.out.println("NO");
		}
	}
}
