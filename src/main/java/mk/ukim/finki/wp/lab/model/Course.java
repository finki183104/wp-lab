package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    Long courseId;
    public String name;
    public String description;
    List<Student> students;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getCourseId() {
        return courseId;
    }

    public List<Student> getStudents() {
        return students;
    }
}
