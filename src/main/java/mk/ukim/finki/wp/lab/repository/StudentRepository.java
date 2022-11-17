package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    List<Student> studentList = new ArrayList<>(5);

    public List<Student> findAllStudents() {
        return studentList;
    }

    public List<Student> findAllByNameOrSurname(String text) {
        return studentList.stream().filter(s -> s.getName().contains(text) || s.getSurname().contains(text)).collect(Collectors.toList());
    }
}
