package com.curriculum.application.dto;

public class ProfessionalExperienceDTO {

	private Long id;
	private String jobPosition;
	private Integer since;
	private Integer until;
	private String description;

	public ProfessionalExperienceDTO() {
	}

	public ProfessionalExperienceDTO(Long id, String jobPosition, Integer since, Integer until, String description) {
		this.id = id;
		this.jobPosition = jobPosition;
		this.since = since;
		this.until = until;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Integer getSince() {
		return since;
	}

	public void setSince(Integer since) {
		this.since = since;
	}

	public Integer getUntil() {
		return until;
	}

	public void setUntil(Integer until) {
		this.until = until;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
