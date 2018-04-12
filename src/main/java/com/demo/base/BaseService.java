package com.demo.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T>{	
	
	@Autowired
	public BaseRepository<T> baseRepository;
	
	public List<T> findAll() {
		System.out.println(baseRepository);
		List<T> listData=(List<T>) baseRepository.findAll();
		return listData;
	}
	public T save(T obj){
		return baseRepository.save(obj);		
	}


}
