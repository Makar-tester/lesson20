import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Outputing {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw;
        Scanner sc;
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        if(a*b==c){
            pw.print("YES");
        }else{
            pw.print("NO");
        }
        pw.close();


    }
}
