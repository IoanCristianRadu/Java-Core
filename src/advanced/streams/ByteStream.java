package advanced.streams;

import java.io.*;

public class ByteStream {

    public static void main(String args[]) throws IOException {

        //Java byte advanced.streams are used to perform input and output of 8-bit bytes.
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\input.txt");
            out = new FileOutputStream("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\output.txt");

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

class ByteStream2 {

    public static void main(String[] args) {

        try {
            byte[] byteVector = {11, 21, 3, 40, 5};
            OutputStream outputStream = new FileOutputStream("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\test.txt");

            for (int i = 0; i < byteVector.length; i++) {
                outputStream.write(byteVector[i]);
            }
            outputStream.write(byteVector);
            outputStream.close();

            InputStream inputStream = new FileInputStream("E:\\Programare\\IntelliJ\\JavaTutorial\\src\\advanced.streams\\test.txt");
            int size = inputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.print(inputStream.read() + " ");
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
