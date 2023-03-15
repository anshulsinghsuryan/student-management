package com.dps.school.bean;

public class StudentBean {
	
	public Long studentRollNumber;
	public String studentName;
	public String studentPhoneNumber;
	
	
	public Long getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(Long studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	@Override
	public String toString() {
		return "StudentBean [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName
				+ ", studentPhoneNumber=" + studentPhoneNumber + "]";
	}
	
	

}
