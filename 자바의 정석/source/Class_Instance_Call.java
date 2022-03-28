package ME_01;

public class Class_Instance_Call {
	public static void main(String[] args) {
		
	}
}

class Ex01Call {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; //인스턴스변수가 클래스변수 참조 가능
	//static cv2 = iv; 클래스변수가 인스턴스변수 바로 참조 불가능
	static int cv2 = new Ex01Call().iv; //따라서 객체 생성 후 참조
	
	static void staticMethod() {
		System.out.println(cv); //static메서드가 클래스변수 호출 가능
		//System.out.println(iv); static메서드가 인스턴스변수 호출 불가능
		Ex01Call a = new Ex01Call();
		System.out.println(a.iv); //따라서 객체 생성 후 호출
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv); //인스턴스메서드는 둘다 호출 가능
	}
	
	static void static2Method() {
		staticMethod(); //static메서드는 static메서드 호출 가능
		//instanceMethod(); static메서드는 인스턴스메서드 바로 호출 불가능
		Ex01Call a = new Ex01Call();
		a.instanceMethod(); //따라서 객체 생성 후 호출
	}
	
	void instance2Method() {
		staticMethod();
		instanceMethod(); //인스턴스메서드는 둘 다 호출 가능
	}
}