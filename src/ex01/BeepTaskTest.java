package ex01;

import java.awt.Toolkit;

public class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		// 첫번째 작업 : '탕'을 5번 출력합니다.
		for (int i = 0; i < 5; i++) {
			System.out.println("탕");
			Thread.sleep(500);
		}
		// 두번째 작업 : '삑'소리를 5번 냅니다.
		// 자바 확장 라이브러리를 이용하여 삑소리 출력 
		// 컴퓨터 시스템에서 삐 소리를 내고싶을때 (사용자가 값을 잘못 입력했거나
		// 경고 창이 뜰 때 운영체제 기본 경고음 발생 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 데스크톱 화면 프로그램을 만들기위해 사용하는 라이브러리 
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("beep");
			Thread.sleep(500);
		}
		
		
	}

}
