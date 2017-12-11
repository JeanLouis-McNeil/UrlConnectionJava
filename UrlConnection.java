/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.connection;

import java.net.URL;

/**
 *
 * @author Owner
 */
public class UrlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // This simple code is only parsing the url...
        URL aURL = new URL("http://www.javaisbetter.com/tutorials/mostrelevant");
        // Through all these lines the url can be exploded so that we can see each of its components.
        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }
    
}
