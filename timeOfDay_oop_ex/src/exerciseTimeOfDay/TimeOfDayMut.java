package exerciseTimeOfDay;

/**
 * 
 * Each instance is a time of day.
 * 
 */

public class TimeOfDayMut {

	/**
	 * @invar The hour must be an integer between 0 and 24
	 * 		| 0 <= hour <= 24
	 * 
	 * @invar The minute must be an integer between 0 and 60
	 * 		| 0 <= minute <= 60
	 */
	
	private int hour;
	private int minute;
	private int minutesSinceMidnight;
	
	/**
	 * Initializes this object so that it represents the time of day on a 24-hour m¡litary time.
	 * 
	 * @throws IllegalArgumentException |  0 <= hour <= 24
	 * @throws IllegalArgumentException | 0 <= minute <= 60
	 * 	
	 * @post This interval's hour equals the given hour
	 *     | getHour() == hour
	 * @post This interval's minute equals the given minute
	 *     | getMinute() == minute
	 */
	
	public TimeOfDayMut(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	
	/**
	 * @basic
	 */
	
	
	public int getHour() {
		return hour;
	}
	
	/**
	 * @basic
	 */
	
	
	public int getMinute() {
		return minute;
	}
	
	/**
	 * @derived
	 * 
	 * @pre Hour and minute variables have to be stablished.
	 * 
	 * @post The result tells you have many minutes have passed since midnight.
	 * 		 | result == hours*60 + minutes
	 */
	
	public int getMinutesSinceMidnight() {
		int minutes = getMinute();
		int hoursToMinutes = getHour() * 60;
		this.minutesSinceMidnight = minutes + hoursToMinutes;
		return minutesSinceMidnight;
	}
	
	/**
	 *Allows you to set the hour of day.
	 * 
	 * @pre Integer between 0 and 24.
	 */
	
	public int setHours(int hour) {
		this.hour = hour;
		return this.hour;
	}
	
	/**
	 * 
	 * Allows you to set the minute of day.
	 * 
	 * @pre Integer between 0 and 60.
	 */
	
	public int setMinutes(int minute) {
		this.minute = minute;
		return this.minute;
	}
	
}
