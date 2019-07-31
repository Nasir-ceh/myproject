package com.nasir.econnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nasir.econnect.entity.CategoryMaster;
import com.nasir.econnect.repository.CategoryMasterRepository;

@Controller
@RequestMapping(value = "api/category")
public class CategoryController {
	
	
	@Autowired
	private CategoryMasterRepository categoryMasterRepo;
	
	@GetMapping()
	public ResponseEntity<List<CategoryMaster>> getAllCategory() {
		List<CategoryMaster> findAll = categoryMasterRepo.findAll();
		return new ResponseEntity<List<CategoryMaster>>(findAll, HttpStatus.OK);
	}
	

}
