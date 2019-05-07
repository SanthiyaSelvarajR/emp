package com.emp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.model.Emp;

@Repository
public class Empdaoimp implements Empdao {

	@Autowired
	SessionFactory factory;
	
	@Override
	public void insert(Emp e) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(e);
	}

	@Override
	public List<Emp> display() {
		Session session=factory.getCurrentSession();
		Query q=session.createQuery("from Emp");
		List<Emp> det=q.list();
		return det;
	}

}
