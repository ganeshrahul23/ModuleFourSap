package com.sapient.dao;

import java.util.HashMap;
import java.util.Map;


import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class DaoImpl implements IDao {
	private static Map<Integer,Account> aMap;
		
	static{
		aMap = new HashMap<>();
		aMap.put(1001, new Account(1001, "ram", 10000));
		aMap.put(1002, new Account(1002, "tom", 5000));
		aMap.put(1003, new Account(1003, "sam", 3000));
	}

	@Override
	public Account getAccount(int aid) throws IdException {
		if(!aMap.containsKey(aid))
			throw new IdException("No Id found");
		return aMap.get(aid);
	}

}
