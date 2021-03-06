import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * File input class that reads in desired data to be processed by either
 * an encrypter or decrypter. Requires a file name as an input string.
 */
class ReadFile {
    String readBlockIn(Charset encoding) throws IOException {
        try {
            String filePath = getFileName();
            byte[] encoded = Files.readAllBytes(Paths.get(filePath));
            return new String(encoded, encoding);
        }
        catch (Exception e) {
            System.out.println("File Read Exception: " + e.getMessage());
            e.printStackTrace();
            return "Failure.";
        }
    }

    String getFileName() throws IOException {
        try {
            String filePath;
            Scanner readIn = new Scanner(System.in);
            System.out.println("Please enter file name!");
            filePath = System.getProperty("user.dir") + "\\" + readIn.next();
            return filePath;
        }
        catch (Exception e) {
            System.out.println("File Read Exception: " + e.getMessage());
            e.printStackTrace();
            return "Failure.";
        }
    }
}