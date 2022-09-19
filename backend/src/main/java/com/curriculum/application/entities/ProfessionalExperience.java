package com.curriculum.application.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_experience")
public class ProfessionalExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String jobPosition;
	private Integer since;
	private Integer until;
	private String description;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	public ProfessionalExperience() {
	}

	public ProfessionalExperience(Long id, String jobPosition, Integer since, Integer until, String description,
			User user) {
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

	public User getUser() {
		return user;
	}

}
