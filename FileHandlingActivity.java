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
        File dir = new File("mysuperawesomedirectory");
        dir.mkdir();
        
        File fileOne = new File("myPerfectFile.txt");
        fileOne.createNewFile();
        File fileTwo = new File("myPerfectedFile.txt");
        fileTwo.createNewFile();
        File fileThree = new File("myPerfectestFile.txt");
        fileThree.createNewFile();
        String dataOne = "Hello, World!";
        Files.write(Paths.get("myPerfectFile.txt"), dataOne.getBytes(StandardCharsets.UTF_8));
        String dataTwo = "Hello, Gorld!";
        Files.write(Paths.get("myPerfectFile.txt"), dataTwo.getBytes(StandardCharsets.UTF_8));
        String dataThree = "Hello, World!";
        Files.write(Paths.get("myPerfectFile.txt"), dataThree.getBytes(StandardCharsets.UTF_8));
    }
}