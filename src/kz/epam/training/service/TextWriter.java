package kz.epam.training.service;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

    public void writeText(String text, String link) {
        try (FileWriter fileWriter = new FileWriter(link, false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
