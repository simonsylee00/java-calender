package honux.calender;

public class Calendar {

	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final String[] STARTING_DAY = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public int getMaxDayofMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}

	}

	public void printCalendar(int year, int month, String startday) {
		System.out.printf("      <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		int maxDay = getMaxDayofMonth(year, month);
		String space = "   ";
		int day = 0;
		for (int j = 0; j < 7; j++) {
			if (STARTING_DAY[j].equals(startday))
				day = j;
		}
		for (int k = 0; k < day; k++) {
			System.out.print(space);
		}
		for (int i = 1; i <= maxDay; i++) {

			System.out.printf("%3d", i);
			
			if ((i+day) % 7 == 0)
				System.out.println();

		}
		System.out.println();
	}

}
