package com.curriculum.application.dto;

public class EducationalExperienceDTO {

	private Long id;
	private String instituion;
	private String courseName;
	private Integer graduationYear;

	public EducationalExperienceDTO() {
	}

	public EducationalExperienceDTO(Long id, String instituion, String courseName, Integer graduationYear) {
		this.id = id;
		this.instituion = instituion;
		this.courseName = courseName;
		this.graduationYear = graduationYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstituion() {
		return instituion;
	}

	public void setInstituion(String instituion) {
		this.instituion = instituion;
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
