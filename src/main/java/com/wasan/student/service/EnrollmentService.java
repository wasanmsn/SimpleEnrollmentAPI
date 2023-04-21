package com.wasan.student.service;

import com.wasan.student.dto.response.EnrollmentDto;
import com.wasan.student.entity.Enrollment;
import com.wasan.student.entity.projection.StudentCourseProjection;
import com.wasan.student.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EnrollmentService implements EnrollmentServiceInterface {
    @Autowired
    private  EnrollmentRepository repository;



    @Override
    public List<EnrollmentDto> findByStudentIdUsingCriteria(String id) {
        List<EnrollmentDto> enrollmentDtos = new ArrayList<>();
        List<Enrollment> enrollments = repository.findByStudentIdUsingCriteria(UUID.fromString(id));
        for (Enrollment enrollment:
             enrollments) {
            enrollmentDtos.add(new EnrollmentDto(enrollment.getStudent(),enrollment.getCourse(),enrollment.getEnrollmentDate()));
        }
        return enrollmentDtos;
    }

    @Override
    public List<StudentCourseProjection> findAllStudentCourse() {
        return repository.findAllStudentCourse();
    }
}
