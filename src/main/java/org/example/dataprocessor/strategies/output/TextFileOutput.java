package org.example.dataprocessor.strategies.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileOutput implements OutputStrategy {
    @Override
    public void output(double result) throws IOException {
        Path path = Paths.get("target", "result.txt");
        Files.createDirectories(path.getParent());
        Files.writeString(path, "Result = " + result);
    }
}
