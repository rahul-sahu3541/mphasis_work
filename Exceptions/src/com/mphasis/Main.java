package com.mphasis;

public class Main {



    public static void main(String[] args) {
        int firstNumber=0,secondNumber= 0;
        try {
            System.out.println(Integer.parseInt(args[0]));
            System.out.println("End try statement");
            // write your code here
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException exception){
            System.out.println("Please provide valid number");

        }
        catch(ArithmeticException exception){
            System.out.println("You can't divide by zero");
        }
        catch(Exception exception){                         //default exception
            System.out.println("Unkonown Exception");
        }
        System.out.println("The end");
    }
}