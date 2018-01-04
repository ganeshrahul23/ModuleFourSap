package com.sapient.dao;

public class JdbcDao implements IDao {

	@Override
	public void display() {
		System.out.println("Accessing from DB");
	}

}
