/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Owner
 */
public class ReadingUrl2 {
      public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.byui.edu/");
        URLConnection byu = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    byu.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
