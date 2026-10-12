package com.junia.class5.optional;

import com.junia.class5.streams.Student;

import java.util.List;
import java.util.Optional;

public class StudentService {
    public static Optional<Student> findStudentById(List<Student> students, Long id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }
}
