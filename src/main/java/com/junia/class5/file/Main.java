package com.junia.class5.file;

import com.junia.class5.streams.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        //write & read the txt file
        Path path = Path.of("students.txt");

        try {
            Files.write(path, List.of("Alice", "Bob", "Charlie"));

            List<String> names = Files.readAllLines(path);
            names.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error while reading/writing file: " + e.getMessage());
        }


        //Naive approach of the csv parsing
        Path csvPath = Path.of("students.csv");
        List<Student> students = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(csvPath);


            lines.forEach(line -> {
                String[] columns = line.split(",");

                Long id = Long.parseLong(columns[0]);
                Integer age = Integer.parseInt(columns[1]);
                String name = columns[2];

                students.add(new Student(id, age, name));
            });
        } catch (IOException e) {
            System.err.println("Error while reading/writing file: " + e.getMessage());
        }
    }

    static void cleanerParsing() {
        // Cleaner approch of the csv parsing using OOP, Streams & Abstraction
        Path csvPath = Path.of("students.csv");
        StudentCsvParser studentCsvParser = new StudentCsvParser();
        List<Student> students = studentCsvParser.parse(csvPath);

        students.forEach(System.out::println);
    }
}
