package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    List<Course> courseList = new ArrayList<>(5);

    public List<Course> findAllCourses() {
        return courseList;
    }

    public Course findById(Long courseId) {
        for (Course c : courseList) {
            if (c.getCourseId().equals(courseId)) {
                return c;
            }
        }
        return null;
    }

    public List<Student> findAllStudentsByCourse(Long courseId) {
        for (Course c : courseList) {
            if (c.getCourseId().equals(courseId)) {
                return c.getStudents();
            }
        }
        return null;
    }

    public Course addStudentToCourse(Student student, Course course) {
        List<Student> tmp = new ArrayList<>();
        for (Course c : courseList) {
            if (c.equals(course)) {
                tmp = c.getStudents();
                tmp.add(student);
                return c;
            }
        }
        return null;
    }
}