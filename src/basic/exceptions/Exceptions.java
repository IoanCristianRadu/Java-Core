package basic.exceptions;

import java.io.*;
import java.rmi.RemoteException;

public class Exceptions {

    public void deposit() throws GeorgeException, RemoteException {
        try {
            if (Math.random() > 0.5) {
                throw new GeorgeException(25);
            } else throw new RemoteException();
        } catch (GeorgeException georgeException) {
            System.out.println(georgeException.getAmount());
        }

    }
}

class ReadData_Demo {
    // Java 7

    public void tryWithResources() {

        try (FileReader fr = new FileReader("E://file.txt")) {
            char[] a = new char[50];
            fr.read(a);   // reads the content to the array
            for (char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File file = new File("file.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);   // reads the content to the array
            for (char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



    /*
    Unchecked Exceptions ( Runtime)
        FileNotFoundException 
        IOException
        ArrayIndexOutOfBoundsException
        NullPointerException
        IllegalArgumentException

     */

/*
try {
   // Protected code <-------------
} catch (ExceptionName e1) {
   // Catch block
} catch (ExceptionName e1) {
   // Catch block
} finally {
   // The finally block always executes
}
 */

// Java 7
/*
catch (IOException|FileNotFoundException ex) {
   logger.log(ex);
   throw ex;
}
 */
