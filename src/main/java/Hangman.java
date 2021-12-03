import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Hangman {
    private List<Character> enteredCharacters;
    private int tryCount;
    private int incorrectTries;
    private String word = "codeup";

    public int getTryCount() {
        return tryCount;
    }

    public int getIncorrectTries() {
        return incorrectTries;
    }

    public String getWord() {
        return word;
    }

    public String getCorrectLetters() {
        return correctLetters;
    }

    private String correctLetters = "";

    public Hangman() {
        enteredCharacters = new ArrayList<>();
        tryCount = 5;
        incorrectTries = 0;
    }

    public void addCharacter(Character character) {
        // see if character is in the word.
        // If character is in the word then add it to the correct guesses at the correct index for the letter.
        // if the character is not in the word then increment incorrectTries and see if we have maxed out incorrect tries.
        // If incorrect tries == to max tries then game over.

        if(!this.word.toLowerCase(Locale.ROOT).contains(character.toString())) {
            this.incorrectTries += 1;
        } else {
            this.correctLetters += character;
        }
        enteredCharacters.add(character);
    }

    public List<Character> getEnteredCharacters() {
        return enteredCharacters;
    }
}
