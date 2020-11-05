package com.example.studentmanagementsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	 @Autowired
	 private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return this.studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	/*
	 * @Override public Student deleteStudent(Student student) {
	 * 
	 * return studentRepository.delete(student); }
	 */

}
