package com.demo.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
	
	@Query(value="select uba,prd from User U inner join U.userBranchAssignment uba inner join uba.branch.company.product prd")
	List<User> getUserrFromProduct();
	

}
