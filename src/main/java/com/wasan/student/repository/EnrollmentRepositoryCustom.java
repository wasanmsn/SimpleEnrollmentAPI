package com.wasan.student.repository;

import com.wasan.student.entity.Enrollment;
import com.wasan.student.entity.projection.StudentCourseProjection;

import java.util.List;
import java.util.UUID;

public interface EnrollmentRepositoryCustom {
    List<Enrollment> findByStudentIdUsingCriteria(UUID id);

}
