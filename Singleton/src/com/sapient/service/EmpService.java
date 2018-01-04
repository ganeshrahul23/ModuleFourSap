package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class EmpService implements IEmpSer{
	
	private static final EmpService instance;
	
	private EmpService() {
		
	}
	
	public static IEmpSer getInstance() {
		return instance;
	}
	
	private static Map<Integer, String> eMap;
	
	static{
		instance = new EmpService();
		eMap = new HashMap<>();
		eMap.put(1001, "ram");
		eMap.put(1002, "tom");
		eMap.put(1003, "sam");
	}

	public String display(int eid) throws Exception{
		if(!eMap.containsKey(eid))
			throw new Exception("No Id Found");
		return eMap.get(eid);
	}
	
}
