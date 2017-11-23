package com.galileoguzman.utvcohitgame;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int counter;
    public TextView txtCounter;
    public ImageView imgFeeling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtCounter = (TextView) findViewById(R.id.txtCounter);
        this.imgFeeling = (ImageView) findViewById(R.id.imgFeeling);
        this.counter = 0;


    }

    public void btnPushPressed(View view){

        this.counter = this.counter + 1;
        Log.d("DEV-UTVCO", "------------------\n Button pressed " + this.counter + " times \n------------------");
        this.txtCounter.setText(String.valueOf(this.counter));

        this.showHappiness(this.counter);
    }

    public void showHappiness(int theCounter){


        if (theCounter < 3){

            this.imgFeeling.setImageResource(R.drawable.img_sadness);

        }else if (theCounter > 3 && theCounter < 6){

            this.imgFeeling.setImageResource(R.drawable.img_reaction);

        }else if (theCounter > 6 && theCounter < 9){

            this.imgFeeling.setImageResource(R.drawable.img_smile);

        }else if (theCounter > 9){

            this.imgFeeling.setImageResource(R.drawable.img_happy);

        }

    }
}
