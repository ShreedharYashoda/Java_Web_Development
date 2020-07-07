package com.shree.springboot_jdbc_mysql.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shree.springboot_jdbc_mysql.model.Customer;

@Repository
public class SpringDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from customers");
		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setCustNo((int) row.get("cust_id"));
			customer.setCustName((String) row.get("cust_name"));
			customer.setCountry((String) row.get("cust_country"));
			customers.add(customer);
		}
		return customers;
	}
}
