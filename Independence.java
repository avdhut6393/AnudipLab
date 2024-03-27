package anu.com;
import java.time.MonthDay;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Independence {

	public static void main(String[] args) {
		MonthDay independenceday = MonthDay.of(Month.AUGUST, 15);
		System.out.println("Independece Day is: " + independenceday);
		// Get the month and day from a MonthDay object
		Month month = independenceday.getMonth();
		int day = independenceday.getDayOfMonth();
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		// Format the MonthDay using a specific pattern
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd");
		String formattedMonthDay = independenceday.format(formatter);
		System.out.println("Formatted MonthDay: " + formattedMonthDay);
		// Check if a MonthDay matches the current date
		MonthDay today = MonthDay.now();
		if (today.equals(independenceday)) {
		System.out.println("Today is Independence Day!");
		} else {
		System.out.println("Today is not Independence Day!.");
		}
		}

	}


