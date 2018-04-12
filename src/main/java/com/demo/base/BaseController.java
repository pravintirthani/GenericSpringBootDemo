package com.demo.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.branch.Branch;

public class BaseController<T> {
	
	@Autowired
	private BaseService<T> baseService;
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public List<Branch> get() {			
		return (List<Branch>) baseService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/save")
	public T save(@RequestBody T entity) {		
		return baseService.save(entity);
	}
}
