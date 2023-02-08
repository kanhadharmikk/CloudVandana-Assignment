import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence (any English sentence): ");
        String sentence = in.nextLine();

        System.out.print("Enter a Letter (any letter from A to Z): ");
        char letter = in.next().charAt(0);

        int letterIndex = sentence.indexOf(letter);

        if(letterIndex >= 0){
            System.out.println("Result: "+ sentence.substring(letterIndex+1));

        }
        else{
            System.out.println("Result: The letter does not exist in the sentence");
        }
    }
}
