package com.junia.class5.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class AbstractCsvParser<T> {

    public List<T> parse(Path path) {
        try (var lines = Files.lines(path)) {
            return lines
                    .skip(1)
                    .filter(line -> !line.isBlank())
                    .map(this::parseLine)
                    .toList();
        } catch (IOException e) {
            System.out.printf("Couldn't read the file because %s", e.getClass());
            throw new RuntimeException(e);
        }
    }

    protected abstract T parseLine(String s);
}
