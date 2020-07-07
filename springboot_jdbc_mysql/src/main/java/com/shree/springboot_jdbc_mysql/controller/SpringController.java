package com.shree.springboot_jdbc_mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.springboot_jdbc_mysql.dao.SpringDAO;
import com.shree.springboot_jdbc_mysql.model.Customer;

@RestController
public class SpringController {

	@Autowired
	private SpringDAO springDAO;
	
	@RequestMapping("/all")
	public List<Customer> getAllCustomers()
	{
		List<Customer> customers = springDAO.getAllCustomers();
		return customers;
	}
}
