package com.emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.model.Emp;
import com.emp.service.Empservice;

@Controller
public class Empcontroller {
	
	@Autowired
	Empservice service;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/")
	public String dostart(Model themodel)
	{
		themodel.addAttribute("emp",new Emp());
		return "register";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute("emp") Emp e,Model themodel)
	{
		e.setAttendance("0%");
		service.insert(e);
		List<Emp> det=service.display();
		themodel.addAttribute("det",det);
		return "display";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/display")
	public String display(Model themodel)
	{
		List<Emp> det=service.display();
		themodel.addAttribute("det",det);
		return "display";
	}
	
	@RequestMapping("/update")
	public String update(Model themodel)
	{
		return "update";
	}
	
	@RequestMapping("/updateinfo")
	public String updateinfo(Model themodel)
	{
		
		List<Emp> det=service.display();
		if(request.getAttribute("mark").equals("yes"))
		{
			int days=0,att=0;
			String person;
			for(Emp t:det)
			{
			  days=days+1;
			  if(request.getAttribute("rollno").equals(t.getRollno()))
			  {
				  att=Integer.parseInt(t.getAttendance());
				  float total=(att/days)*100;
				  String to=total.tosring();
				  t.setAttendance(to);
			  }
			}
			
		}
		
		return "display";
	}
}
