import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        
        File fileOne = new File(dir, "notes.txt");
        fileOne.createNewFile();
        File fileTwo = new File(dir,"data.txt");
        fileTwo.createNewFile();
        File fileThree = new File(dir,"log.txt");
        fileThree.createNewFile();
        String dataOne = "Hello, World!";
        Files.write(Paths.get("notes.txt"), dataOne.getBytes(StandardCharsets.UTF_8));
        String dataTwo = "Hello, Gorld!";
        Files.write(Paths.get("data.txt"), dataTwo.getBytes(StandardCharsets.UTF_8));
        String dataThree = "Hello, World!";
        Files.write(Paths.get("log.txt"), dataThree.getBytes(StandardCharsets.UTF_8));


        Path file1 = Paths.get("notes.txt");
        System.out.println(Files.readString(file1));
        Path file2 = Paths.get("data.txt");
        System.out.println(Files.readString(file2));
        Path file3 = Paths.get("log.txt");
        System.out.println(Files.readString(file3));
        
        File dirt = new File("JavaFileSystem/Backup");
        dirt.mkdir();

        String bigString = Files.readString(file1) + Files.readString(file2) + Files.readString(file3);
        File fileFour = new File(dirt, "backup.txt");
        fileFour.createNewFile();
        Files.write(Paths.get("backup.txt"), bigString.getBytes(StandardCharsets.UTF_8));

        System.out.println("Files in JavaFileSystem...");
        for (File f : dir.listFiles()) {
            System.out.println("..." + f);
        }
        System.out.println("Files in Backup...");
        for (File f2 : dirt.listFiles()) {
            System.out.println("..." + f2);
        }
    }
}