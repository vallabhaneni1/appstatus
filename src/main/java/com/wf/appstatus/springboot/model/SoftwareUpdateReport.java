package com.wf.appstatus.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "software_update_report")
public class SoftwareUpdateReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "application_group_name")
	private String applicationGroupName;

	@Column(name = "application_group_email")
	private String applicationGroupEmail;

	@Column(name = "software_name")
	private String softwareName;

	@Column(name = "software_desc")
	private String softwareDesc;

	@Column(name = "software_ver")
	private String softwareVer;

	@Column(name = "due_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dueDate;

	@Column(name = "applicable")
	private String applicable;

	@Column(name = "app_status")
	private String appStatus;

	@Column(name = "completed_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String completedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApplicationGroupName() {
		return applicationGroupName;
	}

	public void setApplicationGroupName(String applicationGroupName) {
		this.applicationGroupName = applicationGroupName;
	}

	public String getApplicationGroupEmail() {
		return applicationGroupEmail;
	}

	public void setApplicationGroupEmail(String applicationGroupEmail) {
		this.applicationGroupEmail = applicationGroupEmail;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getSoftwareDesc() {
		return softwareDesc;
	}

	public void setSoftwareDesc(String softwareDesc) {
		this.softwareDesc = softwareDesc;
	}

	public String getSoftwareVer() {
		return softwareVer;
	}

	public void setSoftwareVer(String softwareVer) {
		this.softwareVer = softwareVer;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getApplicable() {
		return applicable;
	}

	public void setApplicable(String applicable) {
		this.applicable = applicable;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}

}
