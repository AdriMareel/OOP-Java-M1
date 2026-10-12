package com.junia.class5.optional;

import com.junia.class5.optional.exceptions.StudentNotFoundException;
import com.junia.class5.streams.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        List<Student> students = new ArrayList<>(List.of(
                new Student(1L,18, "Alice"),
                new Student(2L,20, "Bob"),
                new Student(3L,25, "Charles")
            )
        );

        Optional<Student> studentOptional = StudentService.findStudentById(students, 4L);

        String name = studentOptional.map(Student::getName)
                .orElseThrow(() -> new StudentNotFoundException("Student not found for this id"));
        System.out.println(name);
    }
}
