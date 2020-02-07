package kz.epam.training.runnerpackage;

import kz.epam.training.service.TextReader;
import kz.epam.training.service.TextWriter;
import kz.epam.training.translator.EnglishAlphabet;

public class Runner {

    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        EnglishAlphabet englishAlphabet = new EnglishAlphabet();
        TextWriter textWriter = new TextWriter();
        String text = textReader.readText("C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\text.txt");
        System.out.println(text);
        System.out.println(englishAlphabet.translateToMorse(text));
        textWriter.writeText(englishAlphabet.translateToMorse(text),"C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\FileForWrite.txt");

    }
}
