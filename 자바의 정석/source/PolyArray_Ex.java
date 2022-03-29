package ME_02;

public class PolyArray_Ex {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		b.buy(new Tv3());
		b.buy(new Computer3());
		b.buy(new Audio3());
		b.summary();
	}
}
class Product3 {
	int price;
	int bonusPoint;
	
	public Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	public Product3() {}
}
class Tv3 extends Product3 {
	public Tv3() {super(100);}
	public String toString() {return "Tv";}
}
class Computer3 extends Product3 {
	public Computer3() {super(200);}
	public String toString() {return "Computer";}
}
class Audio3 extends Product3 {
	public Audio3() {super(50);}
	public String toString() {return "Audio";}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Product3[] item = new Product3[10];
	int i = 0;
	
	public void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "를 구매하셨습니다.");
	}
	public void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {break;}
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물픔의 총금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		
	}
}