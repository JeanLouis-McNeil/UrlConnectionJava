/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.connection;
   import java.net.*;
import java.io.*;
/**
 *
 * @author Owner
 */
public class ReadingURL {
 // This program should have displayed the html markups of this web page, but for proxy issues it annot be done...

    public static void main(String[] args) throws Exception {
        // The URL is created in this line...
        URL oracle = new URL("http://www.byui.edu/");
        //The BufferedReader has been imported and is ready to read inside
        // the file in the url
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            //This line print out the file.
            System.out.println(inputLine);
        in.close();
    }
}

