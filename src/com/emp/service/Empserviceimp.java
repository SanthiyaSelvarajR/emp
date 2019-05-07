package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.Empdao;
import com.emp.model.Emp;

@Service
public class Empserviceimp implements Empservice {

	@Autowired
	Empdao dao;
	
	@Override
	@Transactional
	public void insert(Emp e) {
		dao.insert(e);
	}

	@Override
	@Transactional
	public List<Emp> display() {
		return dao.display();
	}

}
