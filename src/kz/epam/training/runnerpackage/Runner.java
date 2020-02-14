package kz.epam.training.runnerpackage;

import kz.epam.training.translator.EnglishTranslator;
import kz.epam.training.translator.RussianTranslator;

public class Runner {

    public static void main(String[] args) {
        EnglishTranslator englishAlphabet = new EnglishTranslator();
        RussianTranslator russianAlphabetTranslator = new RussianTranslator();
        String filePathForEnglishTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\EnglishText.txt";
        String filePathForEnglishMorseTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\TranslatedTextFromEnglish.txt";
        String filePathForRussianTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\RussianText.txt";
        String filePathForRussianMorseTextWrite = "C:\\Users\\Aidyn\\IdeaProjects\\MorseProject\\src\\kz\\epam\\training\\resource\\TranslatedTextFromRussian.txt";
        englishAlphabet.runTranslator(filePathForEnglishTextWrite, filePathForEnglishMorseTextWrite);
        russianAlphabetTranslator.runTranslator(filePathForRussianTextWrite,filePathForRussianMorseTextWrite);
    }
}
