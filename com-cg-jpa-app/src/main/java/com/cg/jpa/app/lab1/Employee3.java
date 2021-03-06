package com.cg.jpa.app.lab1;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee3 {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	@Column
	private String employeeName;

	@Column
	private double salary;
	
	@Column
	private String businessUnit;
	
	@Column
	private int age;

	@ManyToOne
	@JoinColumn(name = "sbuId")
	private SBU sbu;

	
	public Employee3(String employeeName, double salary, String businessUnit, int age, SBU sbu) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		this.sbu = sbu;
	}

	public Employee3(int employeeId, String employeeName, double salary, String businessUnit, int age, SBU sbu) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		this.sbu = sbu;
	}

	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SBU getSbu() {
		return sbu;
	}

	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

	@Override
	public String toString() {
		return "Employee3 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + ", sbu=" + sbu + "]";
	}
	
	
	
	
}