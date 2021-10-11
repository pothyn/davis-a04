/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Solution43 {

    private final String filePath = System.getProperty("user.dir") + "/website/";

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        Solution43 app = new Solution43();

        String siteName;
        String author;
        String intake;
        boolean js;
        boolean css;

        // read site name
        System.out.println("Site name: ");
        siteName = in.nextLine();

        // read author
        System.out.println("Author: ");
        author = in.nextLine();

        // prompt for folder for JavaScript (Y/N)
        System.out.println("Do you want a folder for JavaScript? ");
        intake = in.nextLine();
        js = intake.equalsIgnoreCase("y");

        // prompt for folder for CSS (Y/N)
        System.out.println("Do you want a folder for CSS? ");
        intake = in.nextLine();
        css = intake.equalsIgnoreCase("y");

        app.generateWebsites(siteName, js, css);

        app.writeToIndex(siteName, author);

    }

    public void generateWebsites(String siteName, boolean js, boolean css) {

        // In each of the following statements, there shall be a print statement indicating that the task has been performed.

        // Create new folder website
        // Create a new folder inside website path, called siteName
        generateDirectory(siteName);

        // Create index.html file
        generateFile(siteName+"/index.html");

        // if js
        if(js)
            // Create new folder js inside siteName
            generateDirectory(siteName + "/js");
        if(css)
            // Create new folder css inside siteName
            generateDirectory(siteName + "/css");
    }

    public void generateDirectory(String siteName) {
        // create new folder in website/siteName/

        File theDir = new File(filePath + siteName);
        boolean result;

        theDir.mkdirs();
        result = theDir.exists();

        if(result) {
            System.out.println("File Created: " + "./website/"+siteName+"/");
        }

    }

    public void generateFile(String siteName) {
        // create new file in website/siteName/

        File file = new File(filePath+siteName);
        boolean result;

        try {
            file.createNewFile();
        }
        catch(IOException e) {
            e.printStackTrace();
            exit(1);
        }

        result = file.exists();

        if(result) {
            System.out.println("File Created: " + "./website/"+siteName);
        }

    }

    public void writeToIndex(String siteName, String author) throws IOException {

        siteName += "/index.html";

        // Setup File Output
        // open index.html file
        FileWriter output = new FileWriter(filePath + siteName);

        // write <title> siteName <\title> and <meta> author <\meta>
        String htmlData = "<title>" + siteName + "</title>\n" +
                "<head>\n" + "\t<meta name=\"author\" content=\"" + author + "\">\n" +
                "</head>";

        // actually apply the string to the html file
        output.write(htmlData);

        // close index.html file
        output.close();


    }


}
