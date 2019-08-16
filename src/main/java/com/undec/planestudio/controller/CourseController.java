package com.undec.planestudio.controller;

import com.undec.planestudio.model.Course;
import com.undec.planestudio.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    List<Course> courseList(){
        List<Course> list = courseService.findAll();
        return list;
    }
}
