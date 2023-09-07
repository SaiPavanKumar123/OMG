package com.crud;

public class Employee {
	int empno;
	String ename;
	String job;
	String sal;

	public Employee() {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee{" + "Emp No=" + empno + ", EmpName='" + ename + '\'' + ", job='" + job + '\'' + ", salary="
				+ sal + '}';
	}

}