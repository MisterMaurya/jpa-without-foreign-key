package io.pro.jpawithoutforeignkey;

import io.pro.jpawithoutforeignkey.domain.Student;
import io.pro.jpawithoutforeignkey.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.Optional;

@SpringBootApplication
public class JpaWithoutForeignKeyApplication implements ApplicationRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaWithoutForeignKeyApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
	/*	Optional<Student> byId = studentRepository.findById(1L);
		Student student = byId.get();
		System.out.println("Here--"+student);

	//	System.out.println(student.getAddress());*/
	}
}
