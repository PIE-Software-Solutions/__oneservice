package com.kj.oneservice.$packageName$.integration;

import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_ALLOWED_SERVICE_PATHS;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_PID_FILE_WRITER_NAME;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_NAME;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_PWD_COLUMN;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_ROLE_COLUMN;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_SERVICE_COLUMN;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_TABLE;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_USER_COLUMN;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_USER_ROLE_TABLE;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_USER_TABLE;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SEC_REQ;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_JSON_VAL_REQ;
import static com.kj.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_ENABLED_COLUMN;

import static com.kj.oneservice.common.integration.util.CommonConstants.ALLOWED_SERVICE_PATHS;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_PACKAGE_STRUCTURE;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_ENABLED;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_PWD;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_ROLE;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_SERVICE;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_TABLE;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_USER;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_USER_ROLE_TABLE;
import static com.kj.oneservice.common.integration.util.CommonConstants.COMMON_USER_TABLE;
import static com.kj.oneservice.common.integration.util.CommonConstants.SERVICE_NAME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.kj.oneservice.common.integration.util.CommonConstants.SEC_REQ;
import static com.kj.oneservice.common.integration.util.CommonConstants.JSON_VAL_REQ;

import com.kj.oneservice.common.integration.config.AppFilter;


@Configuration
@ComponentScan(basePackages = ( COMMON_PACKAGE_STRUCTURE ))
@SpringBootApplication
public class Application {

	static {
		ALLOWED_SERVICE_PATHS = APP_ALLOWED_SERVICE_PATHS;
		SERVICE_NAME = APP_SERVICE_NAME;
		COMMON_USER_TABLE = APP_USER_TABLE;
		COMMON_USER_ROLE_TABLE = APP_USER_ROLE_TABLE;
		COMMON_SERVICE_TABLE = APP_SERVICE_TABLE;
		COMMON_SERVICE_USER = APP_SERVICE_USER_COLUMN;
		COMMON_SERVICE_PWD = APP_SERVICE_PWD_COLUMN;
		COMMON_SERVICE_ENABLED = APP_SERVICE_ENABLED_COLUMN;
		COMMON_SERVICE_ROLE = APP_SERVICE_ROLE_COLUMN;
		COMMON_SERVICE_SERVICE = APP_SERVICE_SERVICE_COLUMN;
		SEC_REQ = APP_SEC_REQ;
		JSON_VAL_REQ = APP_JSON_VAL_REQ;
	}
	
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.addListeners(new ApplicationPidFileWriter(APP_PID_FILE_WRITER_NAME));
		springApplication.run(args);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	FilterRegistrationBean filter() {
		return new FilterRegistrationBean(new AppFilter());
	}
}
