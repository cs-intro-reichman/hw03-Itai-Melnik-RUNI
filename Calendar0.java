/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {

	// Gets a year (command-line argument), and tests the functions isLeapYear and
	// nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}

	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		int num = 0;
		for (int i = 1; i <= 12; i++) {
		num = nDaysInMonth(i, year);
		System.out.println("Month "+i+" has "+num+" days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}

	// Returns the number of days in the given month and year.
	// April (4), June(6), September(9), and November(11) have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {

		if (isLeapYear(year) && month == 2) {
			return 29;
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			} else if (month == 2) {
				return 28;
			} else {
				return 31;
			}
		}

	}
}
