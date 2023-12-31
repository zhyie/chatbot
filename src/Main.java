import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot bot = new Chatbot();
        Scanner scan = new Scanner(System.in);

        String userInput;

        System.out.println("Bot: Hi! How can I help you?");

        do {
            System.out.print("User: ");
            userInput = scan.nextLine().toLowerCase();

            System.out.println("Bot: " + bot.response(userInput));

        } while (!userInput.equalsIgnoreCase("exit"));
    }
}