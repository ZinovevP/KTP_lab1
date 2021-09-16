package zinovev_lab_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";

        while (!text.equals("Выход")) {
            text = reader.readLine();

            if (!text.equals("Выход")) {
                if (iPal(text)) {
                    System.out.println("Выражение является палиндромом: " + text);
                } else {
                    System.out.println("Выражение не является палиндромом: " + text);
                }
            }
        }

    }

    public static Boolean iPal(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}