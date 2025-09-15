import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        
        // a. Create main directory
        
        // b. Create three text files
        
        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
        File dir = new File("JavaFileSystem");
        dir.mkdir();
        
        File fileOne = new File("notes.txt");
        fileOne.createNewFile();
        File fileTwo = new File("data.txt");
        fileTwo.createNewFile();
        File fileThree = new File("log.txt");
        fileThree.createNewFile();
        String dataOne = "Hello, World!";
        Files.write(Paths.get("notes.txt"), dataOne.getBytes(StandardCharsets.UTF_8));
        String dataTwo = "Hello, Gorld!";
        Files.write(Paths.get("data.txt"), dataTwo.getBytes(StandardCharsets.UTF_8));
        String dataThree = "Hello, World!";
        Files.write(Paths.get("log.txt"), dataThree.getBytes(StandardCharsets.UTF_8));
    }
}