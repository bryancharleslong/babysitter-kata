package babysitter;

public class Babysitter {

	private int startTime;
	private int endTime;
	private int bedTime;
	int charge;

	public int getStartTime() {

		return startTime;
	}

	public int getEndTime() {

		return endTime;
	}

	public int getBedTime() {

		return bedTime;
	}

	public Babysitter(int startTime, int endTime, int bedTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.bedTime = bedTime;
	}

	public int getCharge() {
		int sleepCharge = 0;
		int midnightCharge = 0;
		int awakeCharge = (bedTime - startTime) * 12;
		if (endTime < 5) {
			sleepCharge = (12 - bedTime) * 8;
			midnightCharge = endTime * 16;
		} else {
			sleepCharge = (endTime - bedTime) * 8;
		}

		charge = awakeCharge + sleepCharge + midnightCharge;

		return charge;
	}
}
