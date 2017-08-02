package punzagh_exec6;

public class Tank {

	boolean isFilled;

	protected boolean isFilled() {
		return isFilled;
	}

	protected void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	protected void finalize() {
		if(!isFilled) {
			System.out.println("Tank has now been cleaned");
		}

	}
	}
	
