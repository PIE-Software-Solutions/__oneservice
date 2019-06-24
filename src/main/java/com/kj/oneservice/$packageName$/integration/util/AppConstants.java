package com.kj.oneservice.$packageName$.integration.util;

public class AppConstants {
	
	public static String APP_SERVICE_NAME = "$servicePath$";
	public static String[] APP_ALLOWED_SERVICE_PATHS = new String [] {"/$servicePath$/**"};
	public static String APP_PID_FILE_WRITER_NAME = "oneservice" + APP_SERVICE_NAME + ".pid";
	
	public static final String APP_SERVICE_PWD_COLUMN = "PASSWORD";
	public static final String APP_SERVICE_ROLE_COLUMN = "ROLE";
	public static final String APP_SERVICE_SERVICE_COLUMN = "SERVICE";
	public static final String APP_SERVICE_ENABLED_COLUMN = "ENABLED";
	public static final String APP_SERVICE_TABLE = "LFIM_MS_SERVICE";
	public static final String APP_SERVICE_USER_COLUMN = "USERNAME";
	public static final String APP_USER_ROLE_TABLE = "LFIM_MS_USER_ROLES";
	public static final String APP_USER_TABLE = "LFIM_MS_USERS";
	public static final String APP_SEC_REQ = "$appscreq$";
	public static final String APP_JSON_VAL_REQ = "$appjsonvalreq$";
	public static final String ERROR_CODE_NOT_PRESENT_IN_DB = "Error code not present in DB"; 

}
