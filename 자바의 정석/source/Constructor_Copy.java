package ME_01;

public class Constructor_Copy {
	public static void main(String[] args) {
		Ex01Car c1 = new Ex01Car("red", "auto", 4);
		Ex01Car c2 = new Ex01Car(c1); //c1 ���纻 c2�� ����
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		c2.color = "blue";
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
class Ex01Car {
	String color;
	String gearType;
	int door;
	
	Ex01Car() {}
	Ex01Car(Ex01Car c) {//�ν��Ͻ� ���縦 ���� ������
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Ex01Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public String toString() {
		return "color = " + color + ", gearType = " + gearType + ", door = " + door;
	}
}