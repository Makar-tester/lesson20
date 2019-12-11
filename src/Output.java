import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) throws IOException {
        Scanner scanner;
        PrintWriter writer;
        scanner = new Scanner(new File("input.txt"));
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        writer = new PrintWriter(new File("output.txt"));
        writer.print(a+b);
        writer.close();
    }
}
