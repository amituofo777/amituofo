package cn.bdqn.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer deptno;
	private String dname;
	private String loc;
	private Set<Emp> emps = new HashSet<Emp>();
	
	

	// Constructors

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(Integer deptno) {
		this.deptno = deptno;
	}

	/** full constructor */
	public Dept(Integer deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
	}

	// Property accessors

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Dept(Integer deptno, String dname, String loc, Set<Emp> emps) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}

	

}