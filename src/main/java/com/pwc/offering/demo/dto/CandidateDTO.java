package com.pwc.offering.demo.dto;

import javax.validation.constraints.*;
import java.util.Date;

public class CandidateDTO {
    @NotNull(message = "Please add candidate ID")
    private Long candidateId;
    @NotBlank(message = "Please add candidate's name")
    private String name;
    @Email
    @NotBlank(message = "Please add candidate's email")
    private String email;
    @NotBlank
    @PastOrPresent
    private Date dateAdded;
    @NotBlank(message = "Please add candidate's job code")
    private String jobCode;
    @NotBlank(message = "Please add candidate's tower")
    private String tower;
    private String universityAttended;
    @NotNull(message = "Please add candidate's years of experience")
    private int yearsOfExperience;
    private int currentYearlySalaryNet;
    private String previousEmployer;
    private int currentNet;
    private String bonus;
    private String otherBenefits;
    @NotNull(message = "Please add candidate's expected net salary")
    private int expectationNet;
    @NotNull(message = "Please add candidate's expected gross salary")
    private int expectationGross;
    @NotBlank(message = "Please add candidate's level")
    private String pwcLevel;
    @NotBlank(message = "Please add candidate's grade")
    private String pwcGrade;
    @NotBlank(message = "Please add candidate's ETIC title")
    private String eticTitle;
    private boolean isLineManager;

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }

    public String getUniversityAttended() {
        return universityAttended;
    }

    public void setUniversityAttended(String universityAttended) {
        this.universityAttended = universityAttended;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getCurrentYearlySalaryNet() {
        return currentYearlySalaryNet;
    }

    public void setCurrentYearlySalaryNet(int currentYearlySalaryNet) {
        this.currentYearlySalaryNet = currentYearlySalaryNet;
    }

    public String getPreviousEmployer() {
        return previousEmployer;
    }

    public void setPreviousEmployer(String previousEmployer) {
        this.previousEmployer = previousEmployer;
    }

    public int getCurrentNet() {
        return currentNet;
    }

    public void setCurrentNet(int currentNet) {
        this.currentNet = currentNet;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(String otherBenefits) {
        this.otherBenefits = otherBenefits;
    }

    public int getExpectationNet() {
        return expectationNet;
    }

    public void setExpectationNet(int expectationNet) {
        this.expectationNet = expectationNet;
    }

    public int getExpectationGross() {
        return expectationGross;
    }

    public void setExpectationGross(int expectationGross) {
        this.expectationGross = expectationGross;
    }

    public String getPwcLevel() {
        return pwcLevel;
    }

    public void setPwcLevel(String pwcLevel) {
        this.pwcLevel = pwcLevel;
    }

    public String getPwcGrade() {
        return pwcGrade;
    }

    public void setPwcGrade(String pwcGrade) {
        this.pwcGrade = pwcGrade;
    }

    public String getEticTitle() {
        return eticTitle;
    }

    public void setEticTitle(String eticTitle) {
        this.eticTitle = eticTitle;
    }

    public boolean isLineManager() {
        return isLineManager;
    }

    public void setLineManager(boolean lineManager) {
        isLineManager = lineManager;
    }

    public CandidateDTO(Long candidateId, String name, String email, Date dateAdded, String jobCode, String tower, String universityAttended, int yearsOfExperience, int currentYearlySalaryNet, String previousEmployer, int currentNet, String bonus, String otherBenefits, int expectationNet, int expectationGross, String pwcLevel, String pwcGrade, String eticTitle, boolean isLineManager) {
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.dateAdded = dateAdded;
        this.jobCode = jobCode;
        this.tower = tower;
        this.universityAttended = universityAttended;
        this.yearsOfExperience = yearsOfExperience;
        this.currentYearlySalaryNet = currentYearlySalaryNet;
        this.previousEmployer = previousEmployer;
        this.currentNet = currentNet;
        this.bonus = bonus;
        this.otherBenefits = otherBenefits;
        this.expectationNet = expectationNet;
        this.expectationGross = expectationGross;
        this.pwcLevel = pwcLevel;
        this.pwcGrade = pwcGrade;
        this.eticTitle = eticTitle;
        this.isLineManager = isLineManager;
    }

    public CandidateDTO() {
    }
}



