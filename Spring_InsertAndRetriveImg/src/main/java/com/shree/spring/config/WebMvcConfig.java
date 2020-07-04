package com.shree.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shree.spring.dao.StudentDAO;

@Controller
@EnableWebMvc
@ComponentScan(basePackages = {"com.shree.spring.dao","com.shree.spring.controller"})
public class WebMvcConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/");
		//vr.setSuffix(".jsp");

		return vr;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/SpringDB");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	 @Bean
	   public MultipartResolver multipartResolver() {
	      CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	      multipartResolver.setMaxUploadSize(10485760); // 10MB
	      multipartResolver.setMaxUploadSizePerFile(1048576); // 1MB
	      return multipartResolver;
	   }
	
	@Bean
	public StudentDAO getStudentDao() {
		return new StudentDAO(getDataSource());
	}
}
