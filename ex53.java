import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String read = reader.nextLine();
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + read.substring(0, length));
    }
}
