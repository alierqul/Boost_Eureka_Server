package com.aliergul.coursapp.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Course implements Serializable {
    @Id
    @Column(name = "course_id")
    private String courseId;
    @Column(name = "author_name")
    private String courseName;
    @Column(name = "course_name")
    private String authorName;


}
