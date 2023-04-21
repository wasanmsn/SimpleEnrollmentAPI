package com.wasan.student.dto.response;

import com.wasan.student.entity.Course;
import com.wasan.student.entity.Student;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDto {

    private Student student;


    private Course course;

    private LocalDate enrollmentDate;
}
