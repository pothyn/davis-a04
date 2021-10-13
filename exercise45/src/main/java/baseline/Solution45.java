package baseline;

public class Solution45 {

    private final String fileInputName;
    private final String fileOutputName;
    private String intake;
    private String initialReplace;
    private String finalReplace;

    public Solution45(String fileInputName, String fileOutputName, String initialReplace, String finalReplace) {
        // Set all private variables in the constructor

        // Open fileInputName
        // intake = file contents
        // Close file

    }

    public static void main(String[] args) {

        // The file we print to
        String fileOutputName;

        // Prompt and get fileOutputName;

        // Construct a new instance of this Solution45 class using hardcoded values and fileOutputName

        replaceAndPrint();

    }

    public void replaceAndPrint() {

        pullFromFile();

        replaceAll();

        printToFile();

    }

    public void pullFromFile() {
        // Set up file (fileInputName)

        // set intake to the file as a string

        // close file
    }

    public void replaceAll() {
        // for loop from 0 to (string length MINUS length of the initialReplace string)
            // check if the string is equal to the substring at the current index
                // intake = substring intake(0 to index) + finalReplace + substring intake(index + initialReplace length)
                // index = index - initialReplace length + finalLength
    }

    public void printToFile() {

        // Create new file (fileOutputName)

        // write to file

        // close file

    }

    public String getIntake() {
        // Useful for testing
        return intake;
    }

    public void setIntake(String intake) {
        // Useful for testing too!
        this.intake = intake;
    }
}
