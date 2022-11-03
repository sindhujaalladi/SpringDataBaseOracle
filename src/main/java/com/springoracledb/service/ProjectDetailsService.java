package com.springoracledb.service;

import com.springoracledb.pojo.ProjectDetailsDTO;

public interface ProjectDetailsService {
	
	 void addProjectDetails(ProjectDetailsDTO ProjectDetailsDTO);
	 
	 ProjectDetailsDTO getProjectDetails(int projectid);
}
