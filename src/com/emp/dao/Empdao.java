package com.emp.dao;

import java.util.List;

import com.emp.model.Emp;

public interface Empdao {

	void insert(Emp e);

	List<Emp> display();

}
