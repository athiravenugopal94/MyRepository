package com.example.studentmanagementsystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    private long id;
    private String name;
    private String subject_1;
    private String subject_2;
    private String subject_3;
    private String subject_4;
    private String subject_5;
    private String passpercentage;
    private boolean active;
 
    public Student() {
  
    }
 
    public Student(String name, String subject_1, String subject_2, String subject_3, String subject_4, String subject_5, String passpercentage, boolean active) {
         this.name = name;
         this.subject_1 = subject_1;
         this.subject_2 = subject_2;
         this.subject_3 = subject_3;
         this.subject_4 = subject_4;
         this.subject_5 = subject_5;
         this.passpercentage = passpercentage;
         this.active = active;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public String getSubject_1() {
		return subject_1;
	}

	public void setSubject_1(String subject_1) {
		this.subject_1 = subject_1;
	}

	public String getSubject_2() {
		return subject_2;
	}

	public void setSubject_2(String subject_2) {
		this.subject_2 = subject_2;
	}

	public String getSubject_3() {
		return subject_3;
	}

	public void setSubject_3(String subject_3) {
		this.subject_3 = subject_3;
	}

	public String getSubject_4() {
		return subject_4;
	}

	public void setSubject_4(String subject_4) {
		this.subject_4 = subject_4;
	}

	public String getSubject_5() {
		return subject_5;
	}

	public void setSubject_5(String subject_5) {
		this.subject_5 = subject_5;
	}

    public String getPasspercentage() {
		return passpercentage;
	}

	public void setPasspercentage(String passpercentage) {
		this.passpercentage = passpercentage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", subject_1=" + subject_1 + ", subject_2=" + subject_2 + ", subject=" + subject_3 + ", subject=" + subject_4 + ", subject=" + subject_5 + ", passpercentage=" + passpercentage
       + ", active="+ active +"]";
    }
 
}