package com.juanonlab.azure.pojo;

public class Response {

	String message;

	public Response(String mess) {
		this.setMessage(mess);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
