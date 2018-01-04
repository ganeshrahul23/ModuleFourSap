package com.sapient.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	private static IDao dao = null;
	private static ResourceBundle rb;
	static{
		rb = ResourceBundle.getBundle("sapient");
	}
	
	public static IDao getDaoInstance() {
		try {
			Class cls = Class.forName(rb.getString("cname1"));
			dao = (IDao) cls.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}		
		return dao;
	}
}
