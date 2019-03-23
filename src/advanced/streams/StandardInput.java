package advanced.streams;

import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInput {
    // Read from the console

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = null;

        inputStreamReader = new InputStreamReader(System.in);
        System.out.println("Enter characters, 'q' to quit." );
        char c;

        try{
            do{
                c = (char) inputStreamReader.read();
                System.out.print(c);
            } while( c != 'q');
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(inputStreamReader != null){
                inputStreamReader.close();
            }
        }
    }
}
