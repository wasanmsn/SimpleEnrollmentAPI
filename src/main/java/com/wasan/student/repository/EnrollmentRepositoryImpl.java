package com.wasan.student.repository;

import com.wasan.student.entity.Course;
import com.wasan.student.entity.Enrollment;
import com.wasan.student.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

import java.util.List;
import java.util.UUID;

public class EnrollmentRepositoryImpl implements EnrollmentRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Enrollment> findByStudentIdUsingCriteria(UUID id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Enrollment> query = cb.createQuery(Enrollment.class);
        Root<Enrollment> enrollmentRoot = query.from(Enrollment.class);

        Join<Enrollment, Student> studentJoin = enrollmentRoot.join("student");
        Join<Enrollment, Course> courseJoin = enrollmentRoot.join("course");

        query.select(enrollmentRoot)
                .where(cb.equal(studentJoin.get("studentId"),id));

        return entityManager.createQuery(query).getResultList();
    }
}
