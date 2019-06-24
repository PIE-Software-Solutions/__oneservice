package com.kj.oneservice.$packageName$.integration.dao.model;

public class DBError {
	
	public Integer responseCode;
	
	public String errorMessage;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "DBError [responseCode=" + responseCode + ", errorMessage=" + errorMessage + "]";
	}

}
