package com.cg.jpa.app;

import javax.persistence.*;

@Entity
@Table(name = "cg_dep")
public class Department2 {
	
	@Id
	@Column(name = "did")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "dname", length = 128, nullable = false)
	private String name;

	@Column
	private String city;

	public Department2(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Department2(String name,String city ) {
		super();
		this.name = name;
		this.city = city;
	}

	public Department2() {
		super();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
}