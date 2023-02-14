package com.pwc.offering.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "Candidates")
public class Candidate {
    @Id
    private Long id;
    private String name;

    public Candidate() {
    }

    public Candidate(Long id, String name, String email, Date dateAdded, Job job, Tower tower, Universty universty, int yearsOfExperience, int currentSalary, Employer employer, int currentNetSalary, String bonus, String otherBenefits, int expectedNet, int expectedGross, PwcLevel pwcLevel, PwcGrade pwcGrade, PwcTitle pwcTitle, boolean lineManager) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateAdded = dateAdded;
        this.job = job;
        this.tower = tower;
        this.universty = universty;
        this.yearsOfExperience = yearsOfExperience;
        this.currentSalary = currentSalary;
        this.employer = employer;
        this.currentNetSalary = currentNetSalary;
        this.bonus = bonus;
        this.otherBenefits = otherBenefits;
        this.expectedNet = expectedNet;
        this.expectedGross = expectedGross;
        this.pwcLevel = pwcLevel;
        this.pwcGrade = pwcGrade;
        this.pwcTitle = pwcTitle;
        this.lineManager = lineManager;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Universty getUniversty() {
        return universty;
    }

    public void setUniversty(Universty universty) {
        this.universty = universty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(int currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public int getCurrentNetSalary() {
        return currentNetSalary;
    }

    public void setCurrentNetSalary(int currentNetSalary) {
        this.currentNetSalary = currentNetSalary;
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

    public int getExpectedNet() {
        return expectedNet;
    }

    public void setExpectedNet(int expectedNet) {
        this.expectedNet = expectedNet;
    }

    public int getExpectedGross() {
        return expectedGross;
    }

    public void setExpectedGross(int expectedGross) {
        this.expectedGross = expectedGross;
    }

    public PwcLevel getPwcLevel() {
        return pwcLevel;
    }

    public void setPwcLevel(PwcLevel pwcLevel) {
        this.pwcLevel = pwcLevel;
    }

    public PwcGrade getPwcGrade() {
        return pwcGrade;
    }

    public void setPwcGrade(PwcGrade pwcGrade) {
        this.pwcGrade = pwcGrade;
    }

    public PwcTitle getPwcTitle() {
        return pwcTitle;
    }

    public void setPwcTitle(PwcTitle pwcTitle) {
        this.pwcTitle = pwcTitle;
    }

    public boolean isLineManager() {
        return lineManager;
    }

    public void setLineManager(boolean lineManager) {
        this.lineManager = lineManager;
    }

    @Email
    private String email;
    private Date dateAdded;
    @ManyToOne
    @JoinColumn(name="job_code_id", nullable=false)
    private Job job;
    @ManyToOne
    @JoinColumn(name="tower_id", nullable=false)
    private Tower tower;
    @ManyToOne
    @JoinColumn(name="university_id", nullable=false)
    private Universty universty;
    private int yearsOfExperience;
    private int currentSalary;
    @ManyToOne
    @JoinColumn(name="previous_employer_id", nullable=false)
    private Employer employer;
    private int currentNetSalary;
    private String bonus;
    private String otherBenefits;
    private int expectedNet;
    private int expectedGross;
    @ManyToOne
    @JoinColumn(name="pwc_level_id", nullable=false)
    private PwcLevel pwcLevel;
    @ManyToOne
    @JoinColumn(name="offered_pwc_grade_id", nullable=false)
    private PwcGrade pwcGrade;
    @ManyToOne
    @JoinColumn(name="internal_title_id", nullable=false)
    private PwcTitle pwcTitle;
    private boolean lineManager;
}
