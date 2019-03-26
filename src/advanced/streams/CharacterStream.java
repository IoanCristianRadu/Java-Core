package advanced.streams;

import java.io.*;

public class CharacterStream {
    /*
          Java Byte advanced.streams are used to perform input and output of 8-bit bytes, whereas Java Character advanced.streams are used to perform input and output for 16-bit unicode.
          Though there are many classes related to character advanced.streams but the most frequently used classes are, FileReader and FileWriter.
          Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream but here the major difference is
          that FileReader reads two bytes at a time and FileWriter writes two bytes at a time.
     */

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\input.txt");
            out = new FileWriter("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
