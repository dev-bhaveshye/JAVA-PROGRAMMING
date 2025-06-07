import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class BufferReaderTrial{
    public static void main (String[] args) throws IOException{

        // File myFile = new File("TrialFiles");
        // try{ 
        //     myFile.createNewFile();
               
        // }catch(IOException e){
        //     System.out.println(e);
        // }

        try (BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\bhave\\.vscode\\JAVA\\ReaderTrialFile.txt"))) {
            System.out.println("Reading from file:");
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        

        
    }   


}