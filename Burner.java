
public class Burner {
	public enum Temperature {BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2; //Constant for how long it takes to change temperature
	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}

	public void plusButton() {

		switch(mySetting) {
		case OFF:
			mySetting = Setting.LOW;
			timer = TIME_DURATION;
		case LOW:
			mySetting = Setting.MEDIUM;
			timer = TIME_DURATION;
		case MEDIUM:
			mySetting = Setting.HIGH;
			timer = TIME_DURATION;
		}
	}


	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			mySetting = Setting.MEDIUM;
			timer = TIME_DURATION;
		case MEDIUM:
			mySetting = Setting.LOW;
			timer = TIME_DURATION;
		case LOW:
			mySetting = Setting.OFF;
			timer = TIME_DURATION;
		}
	}
	
	public void updateTemperature() {
		
	}
}
