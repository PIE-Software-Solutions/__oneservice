package com.kj.oneservice.$packageName$.integration.util;

import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_NAME;

public class AppSqlConstants {
	
	public static final String GET_ERROR_DETAILS = "select error_msg, response_cd from ms_error_codes where error_cd = ? and service in ('common', '"+ APP_SERVICE_NAME +"')";
}
