package com.example.baihuay;

/**
 * Created by icesupakit on 10/22/2016.
 */

public class Huay {

    public String getRandomTwoDidgits() {
        int ran1 = (int) (Math.random() * 10);
        int ran2 = (int) (Math.random() * 10);
        String str = ran1 + "" + ran2;


        return str;
    }

    public String getRandomThreeDidgits() {
        int ran1 = (int) (Math.random() * 10);
        int ran2 = (int) (Math.random() * 10);
        int ran3 = (int) (Math.random() * 10);
        String str = ran1 + "" + ran2 + "" + ran3;

        return str;


    }
}
