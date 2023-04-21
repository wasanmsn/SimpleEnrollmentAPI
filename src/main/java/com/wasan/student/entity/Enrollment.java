package com.wasan.student.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name="enrollment_id",columnDefinition = "VARCHAR(36)",nullable = false)
    private UUID enrollmentId;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;

    @Column(name="enrollment_date",nullable = false)
    private LocalDate enrollmentDate;
}
