package ME_01;

public class Class_Instance_Call {
	public static void main(String[] args) {
		
	}
}

class Ex01Call {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; //�ν��Ͻ������� Ŭ�������� ���� ����
	//static cv2 = iv; Ŭ���������� �ν��Ͻ����� �ٷ� ���� �Ұ���
	static int cv2 = new Ex01Call().iv; //���� ��ü ���� �� ����
	
	static void staticMethod() {
		System.out.println(cv); //static�޼��尡 Ŭ�������� ȣ�� ����
		//System.out.println(iv); static�޼��尡 �ν��Ͻ����� ȣ�� �Ұ���
		Ex01Call a = new Ex01Call();
		System.out.println(a.iv); //���� ��ü ���� �� ȣ��
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ��޼���� �Ѵ� ȣ�� ����
	}
	
	static void static2Method() {
		staticMethod(); //static�޼���� static�޼��� ȣ�� ����
		//instanceMethod(); static�޼���� �ν��Ͻ��޼��� �ٷ� ȣ�� �Ұ���
		Ex01Call a = new Ex01Call();
		a.instanceMethod(); //���� ��ü ���� �� ȣ��
	}
	
	void instance2Method() {
		staticMethod();
		instanceMethod(); //�ν��Ͻ��޼���� �� �� ȣ�� ����
	}
}