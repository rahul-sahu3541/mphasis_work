package com.mphasis.main.cui;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

class Process{
    static Logger logger;
    static {
        {
            logger = Logger.getLogger(Process.class.getName());
        }
    }

    public Process method1(){
        logger.log(Level.INFO, "method1");
        return new Process();
    }
    public Process method2(){
        logger.log(Level.INFO, "method2");
        return new Process();
    }
    public Process method3(){
        logger.log(Level.INFO, "method2");
        return new Process();
    }
    public void method4(){
        logger.log(Level.INFO, "method4");
    }


}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Process process = new Process();
        process.method1().method2().method3().method4();
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of Main");

    }
}
