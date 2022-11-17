package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Student;
import mk.ukim.finki.wp.lab.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceDefinition {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> listAll() {
        return null;
    }

    @Override
    public List<Student> searchByNameOrSurname(String text) {
        return null;
    }

    @Override
    public Student save(String username, String password, String name, String surname) {
        return null;
    }
}
