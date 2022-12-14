package com.springoracledb.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsDTO  implements Serializable {
	
	private int projectid;
	private String projectName;
	private String projectDepartment;
	private String projectLocation;
	private String projectTeamName;
	

}
