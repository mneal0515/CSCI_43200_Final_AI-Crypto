import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Controller class to handle the .
 */
class ShiftController {
    private Scanner shiftChoice = new Scanner(System.in);
    private WriteFile WF = new WriteFile();

    boolean shiftChoices(String text) throws IOException {
        System.out.println(text);
        System.out.println("Is this correct?");
        System.out.println("1 for yes, 2 for no.");
        String in = shiftChoice.next();

        if (Objects.equals(in, "2")) {
            return true;
        }
        else {
            WF.outputFile(text);
            System.out.println(text);
            return false;
        }
    }
}