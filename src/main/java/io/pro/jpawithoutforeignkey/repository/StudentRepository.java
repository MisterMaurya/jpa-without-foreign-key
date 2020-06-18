package io.pro.jpawithoutforeignkey.repository;

import io.pro.jpawithoutforeignkey.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Optional<Student> findById(Long id);
}
