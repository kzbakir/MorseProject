package kz.epam.training.translator;

import kz.epam.training.service.Runnable;
import kz.epam.training.service.TextReader;
import kz.epam.training.service.TextWriter;

public class EnglishAlphabetTranslator implements Translatable, Runnable {
    private TextReader textReader = new TextReader();
    private TextWriter textWriter = new TextWriter();
    private char[] englishAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};
    private final String[] morseEnglishAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", " -..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    public String translateToEnglish(String text) {
        return null;
    }

    @Override
    public String translateToMorse(String text) {
        text.toLowerCase();
        String translatedText = " ";
        for (int i = 0; i < text.length(); i++) {
            int indexOfEnglishAlphabet = text.charAt(i);
            for (int j = 0; j < englishAlphabet.length; j++) {
                if (englishAlphabet[j] == indexOfEnglishAlphabet) {
                    translatedText = translatedText + " " + morseEnglishAlphabet[j];
                }
            }
        }
        return translatedText;
    }

    @Override
    public void runTranslator(String filePathForRead, String filePathForWrite) {
        System.out.println("Процесс перевода из английского в морзе");
        String text = textReader.readText(filePathForRead);
        System.out.println("Текст из файла: "+ text);
        System.out.println("Переведенный текст: "+ translateToMorse(text));
        textWriter.writeText(translateToMorse(text),filePathForWrite);
        System.out.println("Ваш переведенный тест успешно сохранен в файле");
    }
}

