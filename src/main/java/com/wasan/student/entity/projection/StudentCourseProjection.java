package com.wasan.student.entity.projection;

import jakarta.persistence.Column;

import java.util.UUID;

public interface StudentCourseProjection {
    UUID getStudentId();
    String getName();
    UUID getCourseId();
    String getTitle();
}
