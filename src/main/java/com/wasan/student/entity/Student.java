package com.wasan.student.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name = "student_id", columnDefinition = "VARCHAR(36)", nullable = false)
    private UUID studentId;

    @Column(name = "name",columnDefinition = "VARCHAR(24)",nullable = false)
    private String name;
}
