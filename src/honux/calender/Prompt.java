package honux.calender;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;
		String startday = "";

		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			if (month == -1)
				break;

			System.out.println("월을 입력하세요.(exit : -1)");
			System.out.print("MONTH> ");
			month = scan.nextInt();
			if (month == -1)
				break;
			if (month < 1 || month < 12) {
				System.out.println("1~12 값을 입력하세요.");
				continue;
			}

			System.out.println("시작 요일을 입력하세요.");
			System.out.print("Weekday> ");
			startday = scan.next();
			
			cal.printCalendar(year, month, startday);
		}
		System.out.println("Bye~");
		scan.close();

	}

}
