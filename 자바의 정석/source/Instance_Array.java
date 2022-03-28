package ME_01;

public class Instance_Array {
	public static void main(String[] args) {
		Ex01Tv[] tvArr = new Ex01Tv[3];
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Ex01Tv();
			tvArr[i].channel = i + 10;
		}
		for (int i = 0; i < tvArr.length; i++) {
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
		for (int i = 0; i < 100; i++) {
			tvArr[2].channelUp();
			System.out.printf("tvArr[2].channel = %d\n", tvArr[2].channel);
		}
	}
}

class Ex01Tv {
	String color;
	boolean power;
	int channel;
	
	public void power(boolean power) {
		this.power = power;
		if (!power) {
			System.out.println("Tv를 종료합니다.");
			System.exit(0);
		}
	}
	public void channelUp() {
		++channel;
		if (channel > 50) {
			System.out.println("마지막 채널입니다.");
			power(false);
		}
	}
	public void channelDown() {--channel;}
}