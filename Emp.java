package cn.bdqn.hibernate.pojo;

import java.util.Date;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empno;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Dept dept; //多对一 引用一的一方dept
	
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
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
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Emp(Integer empno, String ename, String job, Date hiredate,
			Double sal, Double comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	//将查询结果封装在构造函数
	public Emp(String ename, String job) {
		super();
		this.ename = ename;
		this.job = job;
	}
	public Emp(Integer empno, String ename, String job, Date hiredate,
			Double sal, Double comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
	}

	

}