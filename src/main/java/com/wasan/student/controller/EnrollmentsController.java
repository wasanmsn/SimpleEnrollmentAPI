package com.wasan.student.controller;

import com.wasan.student.dto.response.EnrollmentDto;
import com.wasan.student.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnrollmentsController {
    @Autowired

    private EnrollmentService service;

    @GetMapping("enrollments/{id}")
    public List<EnrollmentDto> getEnrollmentsByStudentId(@PathVariable String id){
        return service.findByStudentIdUsingCriteria(id);

    }
}
