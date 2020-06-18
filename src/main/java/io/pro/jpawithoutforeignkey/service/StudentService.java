package io.pro.jpawithoutforeignkey.service;

import io.pro.jpawithoutforeignkey.domain.Student;
import org.springframework.http.ResponseEntity;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */
public interface StudentService {
    ResponseEntity<Student> save(Student student);

    ResponseEntity<?> getStudent(Long studentId);
}
