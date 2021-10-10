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

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        Solution43 app = new Solution43();

        String siteName;
        String author;
        String intake;
        boolean js;
        boolean css;

        // read site name
        siteName = in.nextLine();

        // read author
        author = in.nextLine();

        // prompt for folder for JavaScript (Y/N)
        intake = in.nextLine();
        js = intake.equalsIgnoreCase("y");

        // prompt for folder for CSS (Y/N)
        intake = in.nextLine();
        css = intake.equalsIgnoreCase("y");

        app.generateWebsites(siteName, js, css);

        app.writeToIndex(siteName, author);

    }

    public void generateWebsites(String siteName, boolean js, boolean css) throws IOException {

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


        return;

    }

    public boolean generateDirectory(String siteName) {
        // create new folder in website/siteName/

        File theDir = new File(System.getProperty("user.dir") + "/website/"+siteName + "/");
        boolean result = false;

        theDir.mkdirs();
        result = theDir.exists();

        if(result) {
            System.out.println("File Created: " + "./website/"+siteName+"/");
        }

        return result;
    }

    public boolean generateFile(String siteName) throws IOException {
        // create new file in website/siteName/

        File file = new File(System.getProperty("user.dir") + "/website/"+siteName);
        boolean result = false;

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

        return result;

    }

    public void writeToIndex(String siteName, String author) throws IOException {

        StringBuilder htmlData = new StringBuilder();

        // Setup File Output
        // open index.html file
        FileWriter output = new FileWriter("/website/" + siteName);
        System.out.println(output);

        // write <title> siteName <\title> and <meta> author <\meta>
        htmlData.append("<title>"+siteName+"</title>\n")
                .append("<meta name=\"author\" content=\""+author+">");

        // actually apply the string to the html file
        output.append(htmlData);

        // close index.html file
        output.close();

        return;
    }


}
