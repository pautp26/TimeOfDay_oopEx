package exerciseTimeOfDay.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exerciseTimeOfDay.TimeOfDayMut;

public class TimeOfDayMutTest {

	@Test
	public void test() {
		TimeOfDayMut timeday = new TimeOfDayMut(2, 15);
		assertEquals(2, timeday.getHour());
		assertEquals(15, timeday.getMinute());
		assertEquals(135, timeday.getMinutesSinceMidnight());
	}

}
