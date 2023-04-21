package com.wasan.student.repository;

import com.wasan.student.entity.Enrollment;
import com.wasan.student.entity.projection.StudentCourseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID>,EnrollmentRepositoryCustom {

    @Query("SELECT s.id as studentId, s.name as name, c.id as courseId, c.title as title " +
            "FROM Enrollment e " +
            "JOIN e.student s " +
            "JOIN e.course c")
    List<StudentCourseProjection> findAllStudentCourse();

}
