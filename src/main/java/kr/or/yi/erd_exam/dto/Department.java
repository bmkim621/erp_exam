package kr.or.yi.erd_exam.dto;

public class Department {
	private String deptNo;
	private String deptName;
	private int floor;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String deptNo) {
		this.deptNo = deptNo;
	}
	
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return String.format("Department [deptNo=%s, deptName=%s, floor=%s]", deptNo, deptName, floor);
	}
}
