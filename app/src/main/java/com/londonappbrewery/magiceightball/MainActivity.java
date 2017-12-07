package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall); //Creates a variable of type ImageView links with 8ball image

        Button myButton = (Button) findViewById(R.id.askbutton); //Creates var for button links to 'Ask Button'

        final int[] ballArray = new int[]{ //Creates array for the magic 8 ball
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() { //Listener waits for someone to click the button
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random(); //Creates random number var
                int number = randomNumberGenerator.nextInt(5); //max of 5 links with pics
                int imageResourceId = ballArray[number]; //links image to ballArray
                ballDisplay.setImageResource(imageResourceId); //displays random 8ball image out of 5
            }
        });


    }
}
