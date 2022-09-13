package exercises;

import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?";

        System.out.println("What do you want to search the text for?");
        String searchTerm = input.nextLine().toLowerCase();

        boolean aliceSearch = aliceText.toLowerCase().contains(searchTerm);
        System.out.println("Does the Alice passage contain your search term? " + aliceSearch);
    }
}
