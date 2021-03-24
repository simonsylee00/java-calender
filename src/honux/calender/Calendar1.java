package honux.calender;

import java.util.Calendar;

public class Calendar1 {

	private static Calendar cal = Calendar.getInstance();

	public static void printCalendar(int year) {
		int dayOfWeek = 0;
		int daysOfMonth = 0;
		for (int j = 0; j < 12; j++) {
			printCalendarTable(year, j);
			dayOfWeek = setDate(year, j) - 1;
			daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			space(dayOfWeek);
			printDate(daysOfMonth, dayOfWeek);
			System.out.println("\n");
		}
	}

	private static int setDate(int year, int month) {
		cal.set(year, month, 1);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	private static boolean eachWeek(int i, int day) {
		if ((i + day) % 7 == 0) {
			return true;
		}

		return false;
	}

	private static void space(int dayOfWeek) {
		for (int k = 0; k < dayOfWeek; k++) {
			System.out.print("   ");
		}
	}

	private static void printDate(int daysOfMonth, int dayOfWeek) {
		for (int i = 1; i <= daysOfMonth; i++) {
			System.out.printf("%3d", i);

			if (eachWeek(i, dayOfWeek)) {
				System.out.println();
			}
		}
	}

	private static void printCalendarTable(int year, int month) {
		System.out.printf("      <<%4d년 %3d월>>\n", year, month + 1);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
	}

}
