package com.wasan.student.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name="courses_id",columnDefinition = "VARCHAR(36)",nullable = false)
    private UUID courseId;

    @Column(name="title",columnDefinition = "VARCHAR(24)",nullable = false)
    private String title;
}
