import java.io.*;
import java.util.*;

public class fileIO {
    public static void write(String input) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("FileIOTest.txt"));
            // You can also put an
            // absolute file path instead
            // of just the file name. Make
            // sure that the absolute path
            // has two \\ instead of just
            // one \.
            writer.write("BufferedWriter Test: \n");
            writer.write(input); // This is just some sample text.
            writer.close(); // it's crucial to close the writer, else the code won't work.
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("FileIOTest.txt"));
            String out;
            while ((out = reader.readLine()) != null) {
                System.out.println(out);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter a string you want to give as input to the file.");
        input = sc.nextLine();
        write(input);

        System.out.println("Contents of the file:");
        read();
        sc.close();
    }
}
