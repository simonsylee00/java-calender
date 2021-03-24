package honux.calender;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

	private void runPrompt() {
		int year = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scan.nextInt();

			if (year == -1)
				break;

			Calendar1.printCalendar(year);
		}
		System.out.println("End Calender!");
		scan.close();
	}
	
}