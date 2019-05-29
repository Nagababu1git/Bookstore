package com.app.model;

public class Employe {

	private Integer empId;

	public Employe(Integer empId) {
		super();
		this.empId = empId;
	}

	public Employe() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + "]";
	}
	
	
	
}
