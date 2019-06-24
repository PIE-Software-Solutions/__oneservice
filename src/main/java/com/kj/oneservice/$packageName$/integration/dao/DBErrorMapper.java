package com.kj.oneservice.$packageName$.integration.dao;


import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kj.oneservice.$packageName$.integration.dao.model.DBError;

public class DBErrorMapper implements RowMapper<DBError>{
	
	@Override
	public DBError mapRow(ResultSet resultSet, int rowNumber) throws SQLException{
		DBError dbError = null;
		
		if(null != resultSet) {
			dbError = new DBError();
			int count = 1;
			
			dbError.setErrorMessage(removeNull(resultSet.getString(count++)));
			dbError.setResponseCode(resultSet.getInt(count++));
		}
		return dbError;
	}
	
	private static String removeNull(String resultSetValue) {
		if(isNotBlank(resultSetValue)) {
			resultSetValue = resultSetValue.replaceAll("null", "");
		}
		return resultSetValue;
	}

}
