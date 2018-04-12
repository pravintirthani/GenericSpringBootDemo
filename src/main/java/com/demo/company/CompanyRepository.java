package com.demo.company;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.base.BaseRepository;
import com.demo.branch.Branch;

public interface CompanyRepository extends BaseRepository<Company> {
	
	List<Company> findById(long id);
	
	@Query(value="")
	Optional<Company> getById(long id);
}
