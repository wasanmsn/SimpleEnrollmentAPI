package com.wasan.student.service;

import com.wasan.student.dto.response.EnrollmentDto;
import com.wasan.student.entity.projection.StudentCourseProjection;

import java.util.List;
import java.util.UUID;

public interface EnrollmentServiceInterface {
    List<EnrollmentDto> findByStudentIdUsingCriteria(String id);
    List<StudentCourseProjection> findAllStudentCourse();
}
