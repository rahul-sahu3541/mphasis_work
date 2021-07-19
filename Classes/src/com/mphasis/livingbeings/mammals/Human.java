package com.mphasis.livingbeings.mammals;


import com.mphasis.livingbeings.mammals.organs.Eye;

public class Human {
    public HumanEye lefteye, righteye;
    public Human(){
        System.out.println("Created");
        lefteye = new HumanEye();
        righteye = new HumanEye();
    }
    public class HumanEye extends Eye {
        public float power;
    }
}
