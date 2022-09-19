package com.curriculum.application.dto;

public class LanguageDTO {

	private Long id;
	private String name;
	private String speaking;
	private String reading;
	private String writing;
	private String listening;

	public LanguageDTO() {
	}

	public LanguageDTO(Long id, String name, String speaking, String reading, String writing, String listening) {
		this.id = id;
		this.name = name;
		this.speaking = speaking;
		this.reading = reading;
		this.writing = writing;
		this.listening = listening;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeaking() {
		return speaking;
	}

	public void setSpeaking(String speaking) {
		this.speaking = speaking;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

	public String getListening() {
		return listening;
	}

	public void setListening(String listening) {
		this.listening = listening;
	}

}
