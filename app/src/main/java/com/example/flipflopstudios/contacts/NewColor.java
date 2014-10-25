package com.example.flipflopstudios.contacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by chrisrasch on 10/24/14.
 */
public class NewColor {

    final String[] bgColor = {"#CCFF99","#8FB26B"};


    public int makeColors() {

        Random randomGenerator = new Random(); //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(bgColor.length);

        String color = bgColor[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;



    }
    
    
    
}
