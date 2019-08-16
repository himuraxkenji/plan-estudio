package com.undec.planestudio.service;

import com.undec.planestudio.model.Course;
import com.undec.planestudio.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll(){
        List<Course> courseList = courseRepository.findAll();
        return courseList;
    }

}
