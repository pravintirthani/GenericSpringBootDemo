package com.demo.company;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.base.BaseController;
import com.demo.base.BaseService;

@Service
public class CompanyService extends BaseService<Company>{
	
	public EntityManager em;

	public CompanyService(EntityManager em) {
		this.em = em;
	}

	@Autowired
	private CompanyRepository companyRepository;
	/* Move to BasicService class */
//	public List findAll() {
//		return (List) companyRepository.findAll();
//	}
	
//	public Company save(Company company){
//		return  companyRepository.save(company);		
//	}
	public Optional<Company> getById(long id) {
		return companyRepository.getById(id);		
	}
	public List<Company> findById(long id) {
		return companyRepository.findById(id);		
	}
}
