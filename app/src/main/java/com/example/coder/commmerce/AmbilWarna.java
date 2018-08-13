package com.example.coder.commmerce;

import android.graphics.Color;

import java.util.Random;

public class AmbilWarna {
    private String[] mWarna ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };
    public int getWarna(){
        String warna = "";
        // Memilih fakta secara acak
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mWarna.length);
        warna = mWarna[randomNumber];
        int colorSebagaiInt = Color.parseColor(warna);
        return colorSebagaiInt;
    }
}
