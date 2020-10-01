package com.iiht.dating.dto;

public class InvalidProfileExceptionResponse {

	private String message;
	private long timeStamp;
	private int status;

	//---------------------------------------------------------------------------------------------
	public InvalidProfileExceptionResponse() {
		super();
	}
	//---------------------------------------------------------------------------------------------
	public InvalidProfileExceptionResponse(String message, long timeStamp, int status) {
		super();
		this.message = message;
		this.timeStamp = timeStamp;
		this.status = status;
	}
	//---------------------------------------------------------------------------------------------
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	//---------------------------------------------------------------------------------------------
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	//---------------------------------------------------------------------------------------------
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}