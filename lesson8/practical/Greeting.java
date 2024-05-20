import java.nio.BufferOverflowException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greeting {
    private static int BUFFER_SIZE = 20;

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();

        if (name.length() > BUFFER_SIZE)
            throw new BufferOverflowException();

        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(name);
        if (name.length() == 0 || hasSpecial.find()) {
            throw new IllegalArgumentException();
        }

        System.out.println("Hi there, " + name);
    }
}
