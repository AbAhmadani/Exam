package lab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author ABUBAKAR
 *
 */
public class Lab {
	/**
	 * this is the date object
	 * @param today
	 */
	static Date today = new Date();
	
	/**
	 * @param fahrenheit
	 * @return Fahrenheit To Centigrade
	 */
	public static int fahrenheitToCentigrade(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	/**
	 * @param centigrade
	 * @return Centigrade To Fahrenheit
	 */
	public static int centigradeToFahrenheit(int centigrade) {
		return centigrade * 9 / 5 + 32;
	}
	/**
	 * @param in
	 * @return Remove Sign Of Exclaimation From String
	 */
	public static String removeSignOfExclaimation(String in){
		if(in==null||in.length()==0)
		return in;
		return in.replaceAll("!", "");
	}
	/**
	 * This function is used to get current day
	 * @return Current Day
	 */
	public static int getCurrentDay(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	/**
	 * This function is used to get current Month
	 * @return Current Month
	 */
	public static int getCurrentMonth(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	/**
	 * This function is used to get current year
	 * @return Current Year
	 */
	public static int getCurrentYear(){
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
	}
}
