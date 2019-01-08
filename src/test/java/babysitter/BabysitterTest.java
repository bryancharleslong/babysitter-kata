package babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterTest {
	Babysitter underTest = new Babysitter(5,10,9);
	@Test
	public void shouldHaveStartTime() {
		int startTime = underTest.getStartTime();
		assertEquals(startTime,5);
	}
	@Test
	public void shouldHaveEndTime() {
		int endTime = underTest.getEndTime();
		assertEquals(endTime, 10);
	}
	@Test
	public void shouldHaveBedTime() {
		int bedTime = underTest.getBedTime();
		assertEquals(bedTime,9);
	}
	@Test
	public void shouldCalculateCharge() {
		int charge = underTest.getCharge();
		assertEquals(charge,56);
	}
	Babysitter underTest2 = new Babysitter(5,2,10);
	@Test
	public void shouldCalculateChargeAfterMidnight() {
		int charge = underTest2.getCharge();
		assertEquals(charge,108);
	}
	
}
