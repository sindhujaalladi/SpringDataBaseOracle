package com.springoracledb.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name= "Project")
public class projectDetails {
	
	@Id
	private int projectid;
	
	@Column(name="Project_Name")
	private String projectName;
	
	@Column(name="Project_Department")
	private String projectDepartment;
	
	@Column(name="Project_Location")
	private String projectLocation;
	
	@Column(name="Project_Team_Name")
	private String projectTeamName;
	
	
	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDepartment() {
		return projectDepartment;
	}

	public void setProjectDepartment(String projectDepartment) {
		this.projectDepartment = projectDepartment;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectTeamName() {
		return projectTeamName;
	}

	public void setProjectTeamName(String projectTeamName) {
		this.projectTeamName = projectTeamName;
	}

	
	

}
