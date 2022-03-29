package ME_02;

public class PolyArgumentTest_Ex {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 포인트는 " + b.bounsPoint + "입니다.");
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
			System.out.println("잔액이 모자라 물품을 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		this.bounsPoint += p.bonusPoint;
		System.out.println(p + "를 구매하셨습니다.");
	}
}