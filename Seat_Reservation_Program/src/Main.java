import java.util.Scanner;

/* �۽�ƮŬ���� �¼� Ŭ���� */
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		System.out.print("��ȣ ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("���� �¼��Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("���� �̸� �Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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

/* �����Ͻ� �¼� Ŭ���� */
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		System.out.print("��ȣ ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("���� �¼��Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("���� �̸� �Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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

/* ���ڳ�� �¼� Ŭ���� */
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		System.out.print("��ȣ ? | ==> | ");
		int number = s.nextInt();
		if (number < 1 || number > 10)
			System.out.println("���� �¼��Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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
		System.out.print("�̸� ? | ==> | ");
		String name = s.next();
		
		for(int i = 0; i < seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "";
				System.out.println();
				return;
			}
		}
		System.out.println("���� �̸� �Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
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

/* �¼� ���� �ý��� Ŭ���� */
class Reservation {
	Scanner s = new Scanner(System.in);
	First_Class F_book = new First_Class();
	Bisiness_Class B_book = new Bisiness_Class();
	Economy_Class E_book = new Economy_Class();
	
	void run() {
		System.out.println("*************************************************************");
		System.out.println("�¼� ���� ���α׷� �Դϴ�.");
		System.out.println("*************************************************************");
		
		while(true) {
			System.out.print("| ����: 1 | ��ȸ: 2 | ���: 3 | ���� : 4 | ==> | ");
			int select = s.nextInt();
			int seat_sel = 0;
			switch(select) {
			case 1:
				System.out.print("�¼� ����? S(1) | B(2) | E(3) | ==> | ");
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
					System.out.println("���� �¼��Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
				}
				break;
				
			case 2:
				F_book.show();
				B_book.show();
				E_book.show();
				System.out.println("||<<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>>||\n");
				break;
			
			case 3:
				System.out.print("�¼� ����? S(1) | B(2) | E(3) | ==> | ");
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
					System.out.println("���� �¼��Դϴ�. �ʱ� �޴��� ���ư��ϴ�.\n");
				}
				break;
				
			case 4:
				System.out.println("||<<<<�ý����� �����մϴ�.>>>>||");
				return;
			
			default:
				System.out.println("���� �޴� �Դϴ�. �ٽ� �Է����ּ���.\n");
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