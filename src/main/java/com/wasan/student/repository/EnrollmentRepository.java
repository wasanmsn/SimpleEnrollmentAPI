package com.wasan.student.repository;

import com.wasan.student.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID>,EnrollmentRepositoryCustom {

}
