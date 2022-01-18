package com.aliergul.coursapp.repository;

import com.aliergul.coursapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course, String> {

}
