package io.pro.jpawithoutforeignkey.service.impl;

import io.pro.jpawithoutforeignkey.domain.Student;
import io.pro.jpawithoutforeignkey.repository.StudentRepository;
import io.pro.jpawithoutforeignkey.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<Student> save(Student student) {
        student.addAddress(student.getAddress().get(0));
        return ResponseEntity.ok(studentRepository.save(student));
    }

    @Override
    public ResponseEntity<?> getStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        Map<String, Object> data = new HashMap<>();
        data.put("name", student.getName());
        data.put("age", student.getAge());
     //   data.put("address", student.getAddress());
        return ResponseEntity.ok(data);
    }
}
