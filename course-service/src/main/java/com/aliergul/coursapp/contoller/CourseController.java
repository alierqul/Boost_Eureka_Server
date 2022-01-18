package com.aliergul.coursapp.contoller;

import com.aliergul.coursapp.entity.Course;
import com.aliergul.coursapp.service.CourseService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/courses")
    public List<Course> getCourse() {
        return service.getAllItem();
    }

    @GetMapping("/courses/{id}")
    public Course getSingleCourse(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course){
        return service.create(course);
    }

    @DeleteMapping("/courses/{id}")
    public HttpStatus deleteCourse(@PathVariable String id) {
        service.delete(id);
        return HttpStatus.OK;
    }
    @PutMapping("/courses/{id}")
    public Course deleteCourse(@PathVariable String id,@RequestBody Course course) {
        return service.update(course,id);
    }

}
