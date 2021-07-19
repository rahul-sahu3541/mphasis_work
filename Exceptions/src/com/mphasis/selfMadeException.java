package com.mphasis;
class illegalAgeException extends Exception{
    @Override
    public String getMessage() {
        return "He/She should be 18 or above";
    }
}
class Vote {


    public static void register(int age) throws illegalAgeException {
        if (age < 18) {
            throw new illegalAgeException();
        }
    }
}
public class selfMadeException {
    public static void main(String[] args) {
        try {
            Vote.register(17);
        }
        catch (illegalAgeException exception){
            exception.printStackTrace();
        }
    }
}
