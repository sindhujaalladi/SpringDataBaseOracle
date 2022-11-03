package com.springoracledb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springoracledb.pojo.ProjectDetailsDTO;


@RestController
@RequestMapping("/v1/api/Project")
public class SpringoOracleDbController {
	
	@Autowired
	private com.springoracledb.service.ProjectDetailsService ProjectDetailsService;
	
	@PostMapping("/addProjDetails")
	public ResponseEntity<ProjectDetailsDTO> addProjectDetails(@RequestBody ProjectDetailsDTO projectdetailsdto) {
	    	 this.ProjectDetailsService.addProjectDetails(projectdetailsdto);
	         return new ResponseEntity<>(HttpStatus.CREATED);
	    }
		
	@GetMapping("/{projectid}")
	public ResponseEntity<ProjectDetailsDTO> getProjectDetails(@PathVariable int projectid) {
		ProjectDetailsDTO projectDetailsDTO = this.ProjectDetailsService.getProjectDetails(projectid);
		return new ResponseEntity<>(projectDetailsDTO,HttpStatus.OK);
		
	}
		
	}


