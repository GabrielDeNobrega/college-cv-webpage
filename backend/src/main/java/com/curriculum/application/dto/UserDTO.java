package com.curriculum.application.dto;

import java.util.ArrayList;
import java.util.List;

import com.curriculum.application.entities.*;

public class UserDTO {

	private Long id;
	private String fullName;
	private String pictureLink;
	private String email;
	private String cellPhone;
	private String location;
	private String goal;
	private String linkedInLink;
	private String gitHubLink;

	private List<ProfessionalExperienceDTO> professionalExperiences = new ArrayList<>();
	private List<EducationalExperienceDTO> educationalExperiences = new ArrayList<>();
	private List<SkillDTO> skills = new ArrayList<>();
	private List<LanguageDTO> languages = new ArrayList<>();

	public UserDTO() {
	}

	public UserDTO(Long id, String fullName, String pictureLink, String email, String cellPhone, String location,
			String goal, String linkedInLink, String gitHubLink,
			List<ProfessionalExperienceDTO> professionalExperiences,
			List<EducationalExperienceDTO> educationalExperiences, List<SkillDTO> skills, List<LanguageDTO> languages) {
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

	public UserDTO(User user) {
		id = user.getId();
		fullName = user.getFullName();
		pictureLink = user.getPictureLink();
		email = user.getEmail();
		cellPhone = user.getCellPhone();
		location = user.getLocation();
		goal = user.getGoal();
		linkedInLink = user.getLinkedInLink();
		gitHubLink = user.getGitHubLink();
		professionalExperiences = convertToProfessionalExperienceDTO(user.getProfessionalExperiences());
		educationalExperiences = convertToEducationalExperienceDTO(user.getEducationalExperiences());
		skills = convertToSkillDTO(user.getSkills());
		languages = convertToLanguageDTO(user.getLanguages());
	}

	private List<ProfessionalExperienceDTO> convertToProfessionalExperienceDTO(
			List<ProfessionalExperience> professionalExperiences) {
		List<ProfessionalExperienceDTO> professionalExperiencesDTO = new ArrayList<>();
		for (ProfessionalExperience professionalExperience : professionalExperiences) {
			professionalExperiencesDTO.add(new ProfessionalExperienceDTO(professionalExperience.getId(),
					professionalExperience.getJobPosition(), professionalExperience.getSince(),
					professionalExperience.getUntil(), professionalExperience.getDescription()));
		}

		return professionalExperiencesDTO;
	}

	private List<EducationalExperienceDTO> convertToEducationalExperienceDTO(
			List<EducationalExperience> educationalExperiences) {
		List<EducationalExperienceDTO> educationalExperiencesDTO = new ArrayList<>();
		for (EducationalExperience educationalExperience : educationalExperiences) {
			educationalExperiencesDTO.add(
					new EducationalExperienceDTO(educationalExperience.getId(), educationalExperience.getInstitution(),
							educationalExperience.getCourseName(), educationalExperience.getGraduationYear()));
		}

		return educationalExperiencesDTO;
	}

	private List<SkillDTO> convertToSkillDTO(List<Skill> skills) {
		List<SkillDTO> skillDTO = new ArrayList<>();
		for (Skill skill : skills) {
			skillDTO.add(new SkillDTO(skill.getId(), skill.getName()));
		}

		return skillDTO;
	}

	private List<LanguageDTO> convertToLanguageDTO(List<Language> languages) {
		List<LanguageDTO> languageDTO = new ArrayList<>();
		for (Language language : languages) {
			languageDTO.add(new LanguageDTO(language.getId(), language.getName(), language.getSpeaking(),
					language.getReading(), language.getWriting(), language.getListening()));
		}
		return languageDTO;
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

	public List<ProfessionalExperienceDTO> getProfessionalExperiences() {
		return professionalExperiences;
	}

	public void setProfessionalExperiences(List<ProfessionalExperienceDTO> professionalExperiences) {
		this.professionalExperiences = professionalExperiences;
	}

	public List<EducationalExperienceDTO> getEducationalExperiences() {
		return educationalExperiences;
	}

	public void setEducationalExperiences(List<EducationalExperienceDTO> educationalExperiences) {
		this.educationalExperiences = educationalExperiences;
	}

	public List<SkillDTO> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillDTO> skills) {
		this.skills = skills;
	}

	public List<LanguageDTO> getLanguages() {
		return languages;
	}

	public void setLanguages(List<LanguageDTO> languages) {
		this.languages = languages;
	}

}
