package ex01;

import java.util.Scanner;

public class Menu {

	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("------메인메뉴------\n"+"1. 출력 2. 삭제 3. 어쩌구 4. 어쩌구");
			
			menu:			
			System.out.print("메뉴를 선택해주세요 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1: {
				System.out.println("출력을 선택하셨습니다.");
				System.out.println("메뉴 목록");
				System.out.println("------------------------------------------------------");
				
				Select sel = new Select();
				sel.select();
				
				break;
			}
			default:
				System.out.println("잘못된 번호를 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
			return;
		}
		
	}

}
