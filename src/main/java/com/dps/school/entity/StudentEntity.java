package com.dps.school.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

	
	@Id
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
		return "StudentEntity [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName
				+ ", studentPhoneNumber=" + studentPhoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentName, studentPhoneNumber, studentRollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentEntity other = (StudentEntity) obj;
		return Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentPhoneNumber, other.studentPhoneNumber)
				&& Objects.equals(studentRollNumber, other.studentRollNumber);
	}
	
	
}
