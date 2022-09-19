package com.curriculum.application.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fullName;
	private String pictureLink;
	private String email;
	private String cellPhone;
	private String location;
	private String goal;
	private String linkedInLink;
	private String gitHubLink;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProfessionalExperience> professionalExperiences;

	@OneToMany(mappedBy = "user")
	private List<EducationalExperience> educationalExperiences;

	@OneToMany(mappedBy = "user")
	private List<Skill> skills;

	@OneToMany(mappedBy = "user")
	private List<Language> languages;

	public User() {
	}

	public User(Long id, String fullName, String pictureLink, String email, String cellPhone, String location,
			String goal, String linkedInLink, String gitHubLink, List<ProfessionalExperience> professionalExperiences,
			List<EducationalExperience> educationalExperiences, List<Skill> skills, List<Language> languages) {
		this.id = id;
		this.fullName = fullName;
		this.pictureLink = pictureLink;
		this.email = email;
		this.cellPhone = cellPhone;
		this.location = location;
		this.goal = goal;
		this.linkedInLink = linkedInLink;
		this.gitHubLink = gitHubLink;
		this.professionalExperiences = professionalExperiences;
		this.educationalExperiences = educationalExperiences;
		this.skills = skills;
		this.languages = languages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPictureLink() {
		return pictureLink;
	}

	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getLinkedInLink() {
		return linkedInLink;
	}

	public void setLinkedInLink(String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}

	public String getGitHubLink() {
		return gitHubLink;
	}

	public void setGitHubLink(String gitHubLink) {
		this.gitHubLink = gitHubLink;
	}

	public List<ProfessionalExperience> getProfessionalExperiences() {
		return professionalExperiences;
	}

	public void setProfessionalExperiences(List<ProfessionalExperience> professionalExperiences) {
		this.professionalExperiences = professionalExperiences;
	}

	public List<EducationalExperience> getEducationalExperiences() {
		return educationalExperiences;
	}

	public void setEducationalExperiences(List<EducationalExperience> educationalExperiences) {
		this.educationalExperiences = educationalExperiences;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

}
