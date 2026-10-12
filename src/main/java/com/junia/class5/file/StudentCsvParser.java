package com.junia.class5.file;

import com.junia.class5.streams.Student;

public class StudentCsvParser extends AbstractCsvParser<Student> {

    @Override
    protected Student parseLine(String s) {
        String[] columns = s.split(",");

        Long id = Long.parseLong(columns[0]);
        Integer age = Integer.parseInt(columns[1]);
        String name = columns[2];

        return new Student(id, age, name);
    }
}
