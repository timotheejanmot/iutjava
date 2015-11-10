package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
