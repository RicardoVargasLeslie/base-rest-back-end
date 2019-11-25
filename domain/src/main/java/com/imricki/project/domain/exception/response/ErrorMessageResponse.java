package com.imricki.project.domain.exception.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ErrorMessageResponse")
public class ErrorMessageResponse {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	private Date timestamp;

	private String message;

	private Integer statusCode;

	public ErrorMessageResponse(Date timestamp, String message, Integer statusCode) {
		super();

		this.timestamp = timestamp;
		this.message = message;
		this.statusCode = statusCode;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

}
