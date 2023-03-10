package homework4;

import java.util.Scanner;

public class ArarmClockSetiing {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Day : ");
			int day = scan.nextInt();
			System.out.println("Vacation : ");
			boolean onVacation = scan.nextBoolean();

			String result = reminder(day, onVacation);
			System.out.println(result);
		}
	}

	static String reminder(int day, boolean onVacation) {
		// Are you on vacation ? is it a weekday?
		// sunday saturday
		boolean isWeekend = day == 0 || day == 6;

		// if it's weekend and you are on vacation, time off!
		if (isWeekend && onVacation) {
			return "time off!";
		} else {

			if (isWeekend) {
				return "10:00";
			} else
				return "7:00";
		}

	}

}