package exerciseTimeOfDay.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exerciseTimeOfDay.TimeOfDayImmut;

public class TimeOfDayImmutTest {

	@Test
	public void test() {
		TimeOfDayImmut timeday = new TimeOfDayImmut(12,15);
		assertEquals(12, timeday.getHour());
		assertEquals(15, timeday.getMinute());
	}

}
