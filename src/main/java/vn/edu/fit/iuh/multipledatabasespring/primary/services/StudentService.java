package vn.edu.fit.iuh.multipledatabasespring.primary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fit.iuh.multipledatabasespring.primary.models.Student;
import vn.edu.fit.iuh.multipledatabasespring.primary.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

}
