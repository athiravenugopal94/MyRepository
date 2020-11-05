package com.example.studentmanagementsystem;

import java.util.List;

public interface StudentService {

	List < Student > getAllStudents();
	
	Student createStudent(Student student);

	/* Student deleteStudent(Student student); */
}
