package com.emp.service;

import java.util.List;

import com.emp.model.Emp;

public interface Empservice {

	void insert(Emp e);

	List<Emp> display();

}
