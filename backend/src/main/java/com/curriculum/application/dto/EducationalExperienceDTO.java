package com.curriculum.application.dto;

public class EducationalExperienceDTO {

	private Long id;
	private String institution;
	private String courseName;
	private Integer graduationYear;

	public EducationalExperienceDTO() {
	}

	public EducationalExperienceDTO(Long id, String institution, String courseName, Integer graduationYear) {
		this.id = id;
		this.institution = institution;
		this.courseName = courseName;
		this.graduationYear = graduationYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String instituion) {
		this.institution = instituion;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

}
