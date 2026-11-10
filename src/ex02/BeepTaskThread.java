package ex02;

import java.awt.Toolkit;
import java.util.Iterator;

// Runnable 인터페이스를 이용한 thread 만들기 
class ShowTask implements Runnable {


	@Override
	public void run() {
		// int 를 안적어도 = 0 이 정수기때문에 i 값이 int인것을 알 수 있다. 
		// variable 
		for (var i = 0; i < 5; i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("작업이 중단되었어요");
				return;
			}
		}
	}

}

// 삑 소리를 내는 class 
class BeepTask implements Runnable {


	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (var i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("beep");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("소리가 중단되었어요");
				return;
			}
		}
	}

}


// 메인클래스 	BeepTaskThread 
class BeepTaskThread {

	public static void main(String[] args) {
		// Runnable 부모가 가진 형식으로 형식 변환 
		// 부모가 가진 능력만 쓸 수 있음. 
		// Runnable은 run 메소드만 가지고 있으므로 run()만 호출가능.
		// 1. ShowTask 생성하여 부모 형식으로 고침 
		Runnable task1 = new ShowTask(); //run method를 쓸 수 있게 되었다. (업캐스팅)
		// 2. 관례상 run()은 직접 호출 금지 (start에 도움을 받아라!) 
		// 따라서 start()가 필요.
		// 그런데 Runnable은 start() 함수가 없음.
		// 3. 단짝 친구 Thread의 start() 이용 
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		
		Runnable task2 = new BeepTask();
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		
	}
	}