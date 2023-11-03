package com.imarticus;

public class EmployeeProducer {
	
	int Eid;
	String Ename;
	public EmployeeProducer() {
		super();
	}
	public EmployeeProducer(int eid, String ename) {
		super();
		Eid = eid;
		Ename = ename;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "EmployeeProducer [Eid=" + Eid + ", Ename=" + Ename + "]";
	}
	
	
	

}
