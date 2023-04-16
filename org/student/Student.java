package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name: Prasannamurthy K");
	}
	public void studentDept() {
		System.out.println("Department: Civil Engineering");
	}
	public void studentId() {
		System.out.println("Student ID: 12610103040");
	}
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
		obj.deptName();
		
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
