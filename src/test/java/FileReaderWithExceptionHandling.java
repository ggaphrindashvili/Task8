import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderWithExceptionHandling {
    public static void main(String[] args) {

        Scanner fileScanner = null;

        try {
            File file = new File("data.txt");
            fileScanner = new Scanner(file);
            while ( fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory.");
        } finally {
            if ( fileScanner != null) {
                fileScanner.close();
            }

        }
    }
}