package com.mphasis;
interface Printer{
    public void print(String str);
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        new Printer(){              // Anonymous Class

            @Override
            public void print(String str) {
                System.out.println(str);
            }
        }.print("India");
        Printer printer2 = (name) -> System.out.println(name); //lambda
        printer2.print("Australia");
        Printer printer3 = System.out::println; //another way
        printer3.print("China");
        execute((str) -> System.out.println(str), "cg");
        execute(System.out::println, "netherlands");
    }



    public static void execute(Printer printer, String string){

        printer.print(string);
    }
}
