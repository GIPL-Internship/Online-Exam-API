package com.example.theexamapi.service;


import com.example.theexamapi.entity.TCourseEntity;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    TCourseEntity save(TCourseEntity tStream);

    TCourseEntity update(TCourseEntity tStream);

    void deleteById(String uid);

    Optional<TCourseEntity> findById(String uid);


    List<TCourseEntity> findAll();
}
