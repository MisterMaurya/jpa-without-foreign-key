package io.pro.jpawithoutforeignkey.resources;

import io.pro.jpawithoutforeignkey.domain.Student;
import io.pro.jpawithoutforeignkey.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@RestController
@RequestMapping("api/v1")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("student")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

}
