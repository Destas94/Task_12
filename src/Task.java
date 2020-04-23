import java.sql.SQLOutput;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();
        String text2 = text.replaceAll(" ","");
        System.out.println("Введённый текст без пробелов: " + text2);
    }
}
