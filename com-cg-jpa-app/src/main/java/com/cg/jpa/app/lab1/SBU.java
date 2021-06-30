package com.cg.jpa.app.lab1;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "SBU")
public class SBU {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sbuId;

	@Column
	private String sbuName;

	@Column
	private String sbuHead;

	@OneToMany(mappedBy = "sbu")
	private List<Employee3> employees;

	
	public SBU(String sbuName, String sbuHead) {
		super();
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}


	public SBU(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}


	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSbuId() {
		return sbuId;
	}


	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}


	public String getSbuName() {
		return sbuName;
	}


	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}


	public String getSbuHead() {
		return sbuHead;
	}


	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}


	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}

	
	
	
	
	
}

	