package com.mphasis.main.cui;

import java.io.*;

class Data implements Serializable{

    public int id;
    public String name;
    public transient float salary;

    public Data() {
    }

    public Data(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
public class Main {

    public static  void main(String[] args) {
        Data data = new Data(10, "Ravi",67.6576f);
        try(FileOutputStream fos = new FileOutputStream("ObjectStore.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("ObjectStore.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ){
            oos.writeObject(data);
            Data dataRestored = (Data) ois.readObject();
            System.out.println(dataRestored.id + dataRestored.name + dataRestored.salary );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // write your code here
    }
}
