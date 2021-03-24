package honux.calender;

import java.util.Calendar;

public class CalTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.DAY_OF_MONTH, 21);
		System.out.println(cal.get(Calendar.YEAR));
		
	}
}
