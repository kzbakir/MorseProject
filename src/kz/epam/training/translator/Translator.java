package kz.epam.training.translator;

public class Translator {

    public String translateToMorse(String text,char[] anyAlphabet, String[] morseAlphabet) {
        String translatedText = " ";
        for (int i = 0; i < text.length(); i++) {
            int indexOfEnglishAlphabet = text.toLowerCase().charAt(i);
            for (int j = 0; j < anyAlphabet.length; j++) {
                if (anyAlphabet[j] == indexOfEnglishAlphabet) {
                    translatedText = translatedText + " " + morseAlphabet[j];
                }
            }
        }
        return translatedText;
    }

    public String translate (String morseText,char[] anyAlphabet,String[] morseAlphabet){
        String translatedText = "";
        String[] morseIndex = morseText.split(" ");
        for (int i = 0; i < morseIndex.length; i++) {
            for (int j = 0; j < morseAlphabet.length; j++) {
                if (morseAlphabet[j].equals(morseIndex[i])) {
                    translatedText = translatedText + anyAlphabet[j];

                }
            }
        }
        return translatedText;
    }
}