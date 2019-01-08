package babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterTest {
	@Test
	public void shouldHaveStartTime() {
		Babysitter underTest = new Babysitter(5);
		int startTime = underTest.getStartTime();
		assertEquals(startTime,5);
	}
}
