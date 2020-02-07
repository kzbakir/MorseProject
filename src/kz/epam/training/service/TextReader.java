package kz.epam.training.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    private String line;

    public String readText(String filepath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            line = reader.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
