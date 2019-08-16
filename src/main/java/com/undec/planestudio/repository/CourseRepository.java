package com.undec.planestudio.repository;

import com.undec.planestudio.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findAllByName(String name);
    List<Course> findAllByCode(String code);
    List<Course> findAllByYear(String year);
}
