package exerciseTimeOfDay;

/**
 * 
 * Each instance is a time of day.
 *
 * @immutable
 */


public class TimeOfDayImmut {

	private int hour;
	private int minute;
	
	/**
	 * Initializes this object so that it represents the time of day on a 24-hour m¡litary time.
	 * 
	 * @pre The hour can be any value between 0 and 24, the minute can be any value between 0 and 60.
	 * 		| 0 <= hour <= 24
	 * 		| 0 <= minute <= 60
	 * @post This interval's hour equals the given hour
	 *     | getHour() == hour
	 * @post This interval's minute equals the given minute
	 *     | getMinute() == minute
	 */
	
	public TimeOfDayImmut(int hour, int minute) {
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
}
