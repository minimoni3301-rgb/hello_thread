package ex01;

public class TwoWokersDemo {

	public static void main(String[] args) {

		NumberWork numberwork = new NumberWork ();
		TextWorker textworker     = new TextWorker();
		
		// 두 작업 흐름이 실행되었나요? 
		// 객체가 생성될 때 자동 호출되는 것은 생성자가 유일함.
		// 내가 run()을 불러야한다. 이것은 권장하지 않는다.
		// 위임 start() 
		numberwork.start(); // start를 통해서 run을 대신 실행 
		textworker.start();
		
		// 작업 흐름은 현재 3개 : 메인 + Num + text 
	}

}

//첫번째 numberworker 
class NumberWork extends Thread {
//오버라이딩
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자:" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("숫자 작업 중단");
				return;
			}
		}
	}
}

//두번째 textworker 
class TextWorker extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("문자:안녕하세요!");
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				System.out.println("문자 작업 중단");
				return;
			}
			
		}
	}
}