package com.nikunj.spring.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="User1")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable{

private static final long serialVersionUID = 1L;
	
	public User() {}
	 
	public User(long id, String name, int age, double salary){
	    this.id = id;
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	}
	
	@Id
    @SequenceGenerator(name="seq-gen", sequenceName="user1_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq-gen")
	private long id;
    
	@Column(name="user_name", length=50, nullable=true)
    private String name;
    
	@Column(name="user_age", nullable=true)
    private int age;
    
	@Column(name="user_salary", nullable=true)
    private double salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age
                + ", salary=" + salary + "]";
    }
    
}
