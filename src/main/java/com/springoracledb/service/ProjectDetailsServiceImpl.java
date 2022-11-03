package com.springoracledb.service;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springoracledb.Entity.projectDetails;
import com.springoracledb.pojo.ProjectDetailsDTO;


@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{
	
	@Autowired
	private com.springoracledb.repository.projectRepository projectRepository;

	@Override
	@Transactional
	public void addProjectDetails(ProjectDetailsDTO ProjectDetailsDTO) {
		// TODO Auto-generated method stub
		
		projectDetails proentityobj = new projectDetails();
		proentityobj.setProjectDepartment(ProjectDetailsDTO.getProjectDepartment());
		proentityobj.setProjectid(ProjectDetailsDTO.getProjectid());
		proentityobj.setProjectLocation(ProjectDetailsDTO.getProjectLocation());
		proentityobj.setProjectName(ProjectDetailsDTO.getProjectName());
		proentityobj.setProjectTeamName(ProjectDetailsDTO.getProjectTeamName());
		projectRepository.save(proentityobj);
		
		
		
	}

	@Override
	public ProjectDetailsDTO getProjectDetails(int projectid) {
		// TODO Auto-generated method stub
		Optional<projectDetails> proentityobj = projectRepository.findById(projectid);
		ProjectDetailsDTO projectDetailsDTO = new ProjectDetailsDTO();
		projectDetailsDTO.setProjectDepartment(proentityobj.get().getProjectDepartment());
		projectDetailsDTO.setProjectid(proentityobj.get().getProjectid());
		projectDetailsDTO.setProjectLocation(proentityobj.get().getProjectLocation());
		projectDetailsDTO.setProjectName(proentityobj.get().getProjectName());
		projectDetailsDTO.setProjectTeamName(proentityobj.get().getProjectTeamName());
		return projectDetailsDTO;
	}

}
