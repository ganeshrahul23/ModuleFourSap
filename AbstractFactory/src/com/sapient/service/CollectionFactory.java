package com.sapient.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionFactory {
	
	private static Map<String, String> cMap;
	
	static{
		cMap = new HashMap<>();
		cMap.put("al", "java.util.ArrayList");
		cMap.put("v", "java.util.Vector");
		cMap.put("ll", "java.util.LinkedList");
		cMap.put("hs", "java.util.HashSet");
		cMap.put("lhs", "java.util.LinkedHashSet");
		cMap.put("ts", "java.util.TreeSet");	
	}
	
	public static Collection<String> getCollection(String type) throws Exception{
		Collection<String> col = null;
		if(!cMap.containsKey(type))
			throw new Exception("Facory cannot create instance for your type");
		col = (Collection<String>) Class.forName(cMap.get(type)).newInstance();		
		return col;		
	}
}
