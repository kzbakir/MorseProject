package kz.epam.training;

import kz.epam.training.translator.EnglishTranslator;
import kz.epam.training.translator.RussianTranslator;

public class Runner {

    public static void main(String[] args) {
        EnglishTranslator englishAlphabet = new EnglishTranslator();
        RussianTranslator russianAlphabetTranslator = new RussianTranslator();
        String filePathForEnglishTextWrite = "EnglishText.txt";
        String filePathForEnglishMorseTextWrite = "TranslatedTextFromEnglish.txt";
        String filePathForRussianTextWrite = "RussianText.txt";
        String filePathForRussianMorseTextWrite = "TranslatedTextFromRussian.txt";
        englishAlphabet.runTranslator(filePathForEnglishTextWrite, filePathForEnglishMorseTextWrite);
        russianAlphabetTranslator.runTranslator(filePathForRussianTextWrite,filePathForRussianMorseTextWrite);
    }
}
