package com.wasan.student;

import com.wasan.student.dto.response.EnrollmentDto;
import com.wasan.student.entity.Enrollment;
import com.wasan.student.repository.EnrollmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class StudentApplicationTests {
	@Autowired
	private EnrollmentRepository repository;


	@Test
	void shouldShow2Record() {
		String studentId = "054b0b9c-8148-41f4-95d1-45492ac266c2";
		int expectedLength = 2;
		List<Enrollment> enrollmentDtos = repository.findByStudentIdUsingCriteria(UUID.fromString(studentId));

		int length = enrollmentDtos.size();

		assertThat(length).isEqualTo(expectedLength);


	}

}
