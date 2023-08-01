package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((int) character >= 97 && (int) character <= 122 || (int) character >= 65 && (int) character <= 90) {
            if (character == 'a' || character == 'o' || character == 'A' || character == 'O' || character == 'e'
                    || character == 'E' || character == 'i' || character == 'I' || character == 'u'
                    || character == 'U' || character == 'y' || character == 'Y') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
