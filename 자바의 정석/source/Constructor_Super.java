package ME_02;

public class Constructor_Super {
	public static void main(String[] args) {
		Ex01Point3D p = new Ex01Point3D();
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
	}
}
class Ex01Point {
	int x = 20;
	int y = 30;
	
	public Ex01Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Ex01Point3D extends Ex01Point {
	int z = 40;
	public Ex01Point3D() {
		this(100, 200, 300);
	}
	
	public Ex01Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}