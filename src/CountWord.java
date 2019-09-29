import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String text = scanner.nextLine();
        System.out.println("Enter word want count:");
        char word = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (word == text.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
