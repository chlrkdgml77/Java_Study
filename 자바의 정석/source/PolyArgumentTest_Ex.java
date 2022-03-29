package ME_02;

public class PolyArgumentTest_Ex {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
		System.out.println("���� ����Ʈ�� " + b.bounsPoint + "�Դϴ�.");
	}
}
class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
class Tv extends Product {
	public Tv() {super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product {
	public Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� ���ڶ� ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		money -= p.price;
		this.bounsPoint += p.bonusPoint;
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}
}