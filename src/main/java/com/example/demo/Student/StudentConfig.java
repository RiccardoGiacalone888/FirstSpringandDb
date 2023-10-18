package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Riccardo = new Student(
                    "Riccardo",
                    "jack.mail.com",
                    LocalDate.of(1995, Month.SEPTEMBER, 22)
                    );
            Student Eleonora  = new Student(
                    "Eleonora",
                    "Ele.mail.com",
                    LocalDate.of(1996, Month.MARCH, 19)
            );

            repository.saveAll(List.of(Riccardo,Eleonora));

        };
    }
}
