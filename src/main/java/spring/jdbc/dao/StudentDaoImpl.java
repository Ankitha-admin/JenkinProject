package spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertStudent(Student student) {
		String insertQuery = "INSERT INTO students (id, name, city) VALUES (?,?,?)";
		return jdbcTemplate.update(insertQuery, student.getId(), student.getName(), student.getCity());
	}

	public int updateStudent(Student student) {
		String updateQuery = "UPDATE students SET name = ?, city = ? WHERE id = ?";
		return jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
	}

	public int deleteStudent(int id) {
		String deleteQuery = "DELETE FROM students WHERE id = ?";
		return jdbcTemplate.update(deleteQuery, id);
	}

	public Student getSingleStudent(int id) {

		return null;
	}

	public List<Student> getAllStudents() {
		
		return null;
	}

}
