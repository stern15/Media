package com.semasuka.media;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {


        ImageView peter = (ImageView) findViewById(R.id.peter);

        if (peter.getScaleX()==1){

        peter.animate()
                .scaleX(0.5f)
                .scaleY(0.5f)
                .alpha(0.5f)
                .rotation(180f)
                .translationX(200f)
                .setDuration(2000);}

        else {

            peter.animate()
                    .scaleX(1f)
                    .scaleY(1f)
                    .alpha(1f)
                    .rotation(0f)
                    .translationX(0f)
                    .setDuration(2000);}

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
