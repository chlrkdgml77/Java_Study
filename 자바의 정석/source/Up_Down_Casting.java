package ME_02;

public class Up_Down_Casting {
	public static void main(String[] args) {
		Ex01Car car = new Ex01FireCar();
		/*
		 * 위의 업캐스팅을 풀어서 쓰면
		 * Ex01FireCar f = new Ex01FireCar();
		 * -> Ex01Car car = (Ex01Car)f;
		 */
		Ex01FireCar fe2 = new Ex01FireCar();
		
		//car.water() 불가능 업캐스팅을 통한 다형성으로 객체를 생성했다면 조상 맴버만 사용 가능
		fe2 = (Ex01FireCar)car; //다운캐스팅
		fe2.water();
	}
}

class Ex01Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("운전중~");
	}
	void stop() {
		System.out.println("멈춤");
	}
}
class Ex01FireCar extends Ex01Car {
	void water() {
		System.out.println("물뿌림");
	}
}