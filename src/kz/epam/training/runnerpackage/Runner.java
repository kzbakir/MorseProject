package kz.epam.training.runnerpackage;

import kz.epam.training.service.TextReader;
import kz.epam.training.service.TextWriter;
import kz.epam.training.translator.EnglishAlphabetTranslator;
import kz.epam.training.translator.RussianAlphabetTranslator;

public class Runner {

    public static void main(String[] args) {
        EnglishAlphabetTranslator englishAlphabet = new EnglishAlphabetTranslator();
        RussianAlphabetTranslator russianAlphabetTranslator = new RussianAlphabetTranslator();
        String filePathForEnglishTextRead = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\EnglishTextRead.txt";
        String filePathForEnglishTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\TranslatedTextFromEnglish.txt";
        String filePathForRussianTextRead = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\RussianTextRead.txt";
        String filePathForRussianTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\TranslatedTextFromRussian.txt";
        englishAlphabet.runTranslator(filePathForEnglishTextRead, filePathForEnglishTextWrite);
        russianAlphabetTranslator.runTranslator(filePathForRussianTextRead,filePathForRussianTextWrite);
    }
}
