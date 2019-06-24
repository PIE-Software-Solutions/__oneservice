package com.kj.oneservice.$packageName$.integration.dao;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kj.oneservice.$packageName$.integration.dao.model.DBError;

import static com.kj.oneservice.common.integration.util.CommonConstants.ONESERVICE_JDBC_TEMPLACE;
import static com.kj.oneservice.$packageName$.integration.util.AppSqlConstants.GET_ERROR_DETAILS;

import java.util.List;

public abstract class OneServiceDAO {
	
	@Autowired
	@Qualifier(ONESERVICE_JDBC_TEMPLACE)
	protected JdbcTemplate oneServiceJdbcTemplate;
	
	public List<DBError> getErrorDetails(String errorCode){
		
		List<DBError> errorDetailsList = null;
		
		if(isNotBlank(errorCode)) {
			errorDetailsList = oneServiceJdbcTemplate.query(GET_ERROR_DETAILS, new Object[] {errorCode},
					new DBErrorMapper());
		}
		return errorDetailsList;
	}

}
