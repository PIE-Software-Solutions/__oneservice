package com.kj.oneservice.$packageName$.integration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kj.oneservice.common.integration.model.ServiceResponse;
import com.kj.oneservice.common.integration.util.AppLogger;

import com.kj.oneservice.$packageName$.integration.dao.$serviceNamecc$DAO;
import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Request;
import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Response;

@Repository
public class $serviceNamecc$Service extends OneServiceService{
	
	private static final AppLogger LOGGER = new AppLogger($serviceNamecc$Service.class.getName());
	
	@Autowired
	private $serviceNamecc$DAO $serviceName$DAO;
	
	public ServiceResponse get($serviceNamecc$Request $serviceName$Request) {
		
		final String METHOD_NAME = "get";
		
		String queryString = null;
		
		List<Object> objectList = $serviceName$DAO.get($serviceName$Request, queryString);
		ServiceResponse response = null;
		
		return response;
		
	}
	
	public static void populate$serviceNamecc$Response($serviceNamecc$Request $serviceName$Request,
			$serviceNamecc$Response $serviceName$Response) {
		
		if(null != $serviceName$Request && null != $serviceName$Response) {
			
		}
		
	}

}
