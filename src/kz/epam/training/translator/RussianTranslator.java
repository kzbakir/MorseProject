package kz.epam.training.translator;

import kz.epam.training.service.Runnable;
import kz.epam.training.service.TextReader;
import kz.epam.training.service.TextWriter;

public class RussianTranslator extends Translator implements  Runnable {
    private TextReader textReader = new TextReader();
    private TextWriter textWriter = new TextWriter();
    private final char[] russianAlphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь',
            'ы', 'э', 'ю', 'я', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};
    private final String[] morseRussianAlphabet = {".-", "-...", ".--", "--.", "-..", ".", ".-.--", "...-", "--..", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-",
            "..-.", "....", "-.-.", "---.", "----", "--.-", "-..-", "-..-", "-.--", "..-..", "..--", ".-.-", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    @Override
    public void runTranslator(String filePathForRead, String filePathForWrite) {
        System.out.println("Процесс перевода из русского в морзе");
        String text = textReader.readText(filePathForRead);
        System.out.println("Текст из файла: "+ text);
        System.out.println("Переведенный текст: "+ translateToMorse(text,russianAlphabet,morseRussianAlphabet));
        textWriter.writeText(translateToMorse(text,russianAlphabet,morseRussianAlphabet),filePathForWrite);
        System.out.println("Обратный перевод: "+ translate(translateToMorse(text,russianAlphabet,morseRussianAlphabet),russianAlphabet,morseRussianAlphabet));
        System.out.println("Ваш переведенный текст успешно сохранен в файле");
    }
}
