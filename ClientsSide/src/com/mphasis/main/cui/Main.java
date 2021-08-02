package com.mphasis.main.cui;


import java.net.*;
import java.io.*;

class SimpleClient {
    public static void main(String args[]) {

        try {
            // Open your connection to a server, at port 5432
            // localhost used here
            Socket s1 = new Socket("DESKTOP-3THRRN6", 5432);

            // Get an input stream from the socket
            InputStream is = s1.getInputStream();
            // Decorate it with a "data" input stream

            BufferedReader dis = new BufferedReader(new InputStreamReader(is));
            // Read the input and print it to the screen
            System.out.println(dis.readLine());

            // When done, just close the steam and connection
            dis.close();
            s1.close();

        } catch (ConnectException connExc) {
            System.err.println("Could not connect.");

        } catch (IOException e) {
            // ignore
        } // END of try-catch
    } // END of main method
}
