package com.aliergul.coursapp.service;

import com.aliergul.coursapp.entity.Course;
import com.aliergul.coursapp.error.NotFoundRunTimeException;
import com.aliergul.coursapp.repository.ICourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService implements ICRUDProgress<Course> {

    private final ICourseRepository service;

    public CourseService(ICourseRepository service) {
        this.service = service;
    }

    @Override
    public Course create(Course entity) {
        return service.save(entity);
    }

    @Override
    public Course update(Course entity, String id) {
        Course course=getById(id);
        course.setCourseId(entity.getCourseId());
        course.setCourseName(entity.getCourseName());
        course.setAuthorName(entity.getCourseName());

        return service.save(course);
    }

    @Override
    public List<Course> getAllItem() {
        return service.findAll();
    }

    @Override
    public Course getById(String id) {
       Course inDB=service.getById(id);
        if(inDB==null){
            throw new NotFoundRunTimeException("Not Found Course");
        }
        return inDB;
    }

    @Override
    public void delete(String id) {
        Course inDB=getById(id);
        service.delete(inDB);
    }
}
