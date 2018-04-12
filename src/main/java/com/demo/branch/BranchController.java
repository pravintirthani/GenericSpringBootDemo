package com.demo.branch;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.base.BaseController;

@RestController
@RequestMapping("/branch")
public class BranchController extends BaseController<Branch> {
	
//	@Autowired
//	private BranchService branchService;	
//
//	@RequestMapping(method=RequestMethod.GET,value="/all")
//	public List<Branch> get() {	
//		System.out.println("dsdgsdg");
//		return branchService.findAll();
//	}
//	
//	@RequestMapping(method=RequestMethod.POST,value="/save")
//	public Branch save(@RequestBody Branch branch) {		
//		return branchService.save(branch);
//	}
}
