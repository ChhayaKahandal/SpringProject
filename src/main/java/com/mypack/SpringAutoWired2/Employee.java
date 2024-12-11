package com.mypack.SpringAutoWired2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee 
{
	

    @Value("111")//apan main class mdhe value n deta ithun pn variabla value pass kru shkto.
	private int EmployeeId;
    @Value("Chhaya")
	private String ename;
    @Value("58000")
	private int salary;
	
	@Autowired//Address class chya property employee class mdhe yeun jatil apoap.
	private  Address address;


	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", ename=" + ename + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	

}
