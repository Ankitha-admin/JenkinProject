package spring.jdbc.dao;

import java.util.List;

import spring.jdbc.entities.Student;

public interface StudentDao {
	
	int insertStudent(Student student);
	
	int updateStudent(Student student);
	
	int deleteStudent(int id);
	
	Student getSingleStudent(int id);
	
	List<Student> getAllStudents();
}
