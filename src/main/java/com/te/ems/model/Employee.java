package com.te.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

	@Entity
	@Data
	@Table(name = "Employee_Management_System")
	public class Employee {
		@Id
		@Column(name = "Employee_Id")
		private int empId;
		@Column(name = "Employee_Name")
		private String name;
		@Column(name = "Employee_Age")
		private int age;
		@Column(name = "Employee_Job")
		private String job;
		@Column(name = "Employee_Salary")
		private double salary;
}
