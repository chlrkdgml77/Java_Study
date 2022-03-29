package ME_02;

public class Super_01 {
	public static void main(String[] args) {
		Ex01Child c = new Ex01Child();
		c.method();
		System.out.println(c.getLication());
	}
}

class Ex01Parent {
	int x = 20;
	
	public String getLocation() {
		return "[x = " + x +"]";
	}
}

class Ex01Child extends Ex01Parent {
	int x = 10;
	int y = 15;
	public String getLication() {
		return super.getLocation() + "[y = " + y + "]";
	}
	public void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
