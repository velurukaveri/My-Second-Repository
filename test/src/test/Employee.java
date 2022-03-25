package test;
public class Employee {
	private Integer empNo;
	public Employee() {
		super();
	}
	private String ename;
	private String job;
	private Long mgr;
	private String hireDate;
	private Float sal;
	private Float comm;
	private Integer deptNO;
	public Employee(Integer empNo, String ename, String job, Long mgr, String hireDate, Float sal, Float comm,
			Integer deptNO) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNO = deptNO;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
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
	public Long getMgr() {
		return mgr;
	}
	public void setMgr(Long mgr) {
		this.mgr = mgr;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public Float getComm() {
		return comm;
	}
	public void setComm(Float comm) {
		this.comm = comm;
	}
	public Integer getDeptNO() {
		return deptNO;
	}
	public void setDeptNO(Integer deptNO) {
		this.deptNO = deptNO;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sal=" + sal + ", comm=" + comm + ", deptNO=" + deptNO + "]";
	}
	
}
