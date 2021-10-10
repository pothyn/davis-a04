package baseline;

public class Solution43 {

    public static void main(String[] args) {

        // read site name
        // read author
        // prompt for folder for JavaScript (Y/N)
        // prompt for folder for CSS (Y/N)

        generateWebsites(siteName, js, css);

        writeToIndex(siteName, author);

    }

    public void generateWebsites(String siteName, boolean js, boolean css) {

        // In each of the following statements, there shall be a print statement indicating that the task has been performed.

        // Create new folder website
        // Create a new folder inside website path, called siteName

        // Create index.html file

        // if js
            // Create new folder js inside siteName
        // if css
            // Create new folder css inside siteName

        return;

    }

    public void writeToIndex(String siteName, String author) {

        // open index.html file
        // write <title> siteName <\title> and <meta> author <\meta>
        // close index.html file

        return;
    }

}
