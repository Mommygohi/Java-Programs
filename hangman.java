import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    private static String generatePhrase(){
        String[] phrases = {"armadillo", "banana", "chocolate"};
        Random rand = new Random();
        int num = rand.nextInt(3);
        return phrases[num];
    }
    
    public static void main(String[] args){
        System.out.println(generatePhrase());
    }
}
