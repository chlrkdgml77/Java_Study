package ME_02;

public class Up_Down_Casting {
	public static void main(String[] args) {
		Ex01Car car = new Ex01FireCar();
		/*
		 * ���� ��ĳ������ Ǯ� ����
		 * Ex01FireCar f = new Ex01FireCar();
		 * -> Ex01Car car = (Ex01Car)f;
		 */
		Ex01FireCar fe2 = new Ex01FireCar();
		
		//car.water() �Ұ��� ��ĳ������ ���� ���������� ��ü�� �����ߴٸ� ���� �ɹ��� ��� ����
		fe2 = (Ex01FireCar)car; //�ٿ�ĳ����
		fe2.water();
	}
}

class Ex01Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("������~");
	}
	void stop() {
		System.out.println("����");
	}
}
class Ex01FireCar extends Ex01Car {
	void water() {
		System.out.println("���Ѹ�");
	}
}