import java.util.Scanner;

/* 퍼스트클래스 좌석 클래스 */
class First_Class {
	Scanner s = new Scanner(System.in);
	private String[] seat = new String[10];
	
	First_Class() {
		for(int i = 0; i < seat.length; i++)
			seat[i] = "";
	}
	
	void Booking() {
		System.out.print("First_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		System.out.print("번호 ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("없는 좌석입니다. 초기 메뉴로 돌아갑니다.\n");
		else {
			seat[number - 1] = name;
			System.out.println();	
		}
	}
	
	void Cancel() {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("없는 이름 입니다. 초기 메뉴로 돌아갑니다.\n");
	}
	
	void show() {
		System.out.print("First_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
	}
}

/* 비지니스 좌석 클래스 */
class Bisiness_Class {
	Scanner s = new Scanner(System.in);
	private String[] seat = new String[10];
	
	Bisiness_Class() {
		for(int i = 0; i < seat.length; i++)
			seat[i] = "";
	}
	
	void Booking() {
		System.out.print("Bisiness_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		System.out.print("번호 ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("없는 좌석입니다. 초기 메뉴로 돌아갑니다.\n");
		else {
			seat[number - 1] = name;
			System.out.println();	
		}
	}
	
	void Cancel() {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("없는 이름 입니다. 초기 메뉴로 돌아갑니다.\n");
	}
	
	void show() {
		System.out.print("Bisiness_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
	}
}

/* 이코노미 좌석 클래스 */
class Economy_Class {
	Scanner s = new Scanner(System.in);
	private String[] seat = new String[10];
	
	Economy_Class() {
		for(int i = 0; i < seat.length; i++)
			seat[i] = "";
	}
	
	void Booking() {
		System.out.print("Economy_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		System.out.print("번호 ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("없는 좌석입니다. 초기 메뉴로 돌아갑니다.\n");
		else {
			seat[number - 1] = name;
			System.out.println();
		}
	}
	
	void Cancel() {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
		System.out.print("이름 ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("없는 이름 입니다. 초기 메뉴로 돌아갑니다.\n");
	}
	
	void show() {
		System.out.print("Economy_Class\t>>\t");
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(""))
				System.out.print("---\t");
			else
				System.out.print(seat[i] + "\t");
		}
		System.out.println();
	}
}

/* 좌석 예약 시스템 클래스 */
class Reservation {
	Scanner s = new Scanner(System.in);
	First_Class F_book = new First_Class();
	Bisiness_Class B_book = new Bisiness_Class();
	Economy_Class E_book = new Economy_Class();
	
	void run() {
		System.out.println("*************************************************************");
		System.out.println("좌석 예약 프로그램 입니다.");
		System.out.println("*************************************************************");
		
		while(true) {
			System.out.print("| 예약: 1 | 조회: 2 | 취소: 3 | 종료 : 4 | ==> | ");
			int select = s.nextInt();
			int seat_sel = 0;
			switch(select) {
			case 1:
				System.out.print("좌석 구분? S(1) | B(2) | E(3) | ==> | ");
				seat_sel = s.nextInt();
				switch(seat_sel) {
				case 1:
					F_book.Booking();
					break;
				case 2:
					B_book.Booking();
					break;
				case 3:
					E_book.Booking();
					break;
				default:
					System.out.println("없는 좌석입니다. 초기 메뉴로 돌아갑니다.\n");
				}
				break;
				
			case 2:
				F_book.show();
				B_book.show();
				E_book.show();
				System.out.println("||<<<<조회를 완료하였습니다.>>>>||\n");
				break;
			
			case 3:
				System.out.print("좌석 구분? S(1) | B(2) | E(3) | ==> | ");
				seat_sel = s.nextInt();
				switch(seat_sel) {
				case 1:
					F_book.Cancel();
					break;
				case 2:
					B_book.Cancel();
					break;
				case 3:
					E_book.Cancel();
					break;
				default:
					System.out.println("없는 좌석입니다. 초기 메뉴로 돌아갑니다.\n");
				}
				break;
				
			case 4:
				System.out.println("||<<<<시스템을 종료합니다.>>>>||");
				return;
			
			default:
				System.out.println("없는 메뉴 입니다. 다시 입력해주세요.\n");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Reservation reser = new Reservation();
		reser.run();
	}
}