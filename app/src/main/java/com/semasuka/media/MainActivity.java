package com.semasuka.media;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView peter = (ImageView) findViewById(R.id.peter);
      /* ImageView stewie=(ImageView) findViewById(R.id.stewie);

      if(peter.getAlpha() == 1) {
        */

        peter.animate().translationXBy(1000f).setDuration(2000);
     /*  stewie.animate().alpha(1f).setDuration(2000);


        */
        peter.setTranslationX(1000f);

/*
    }
       else {
           peter.animate().alpha(1f).setDuration(2000);
            stewie.animate().alpha(0f).setDuration(2000);


       }*/
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView peter=(ImageView) findViewById(R.id.peter);
        peter.setTranslationX(-1000f);

      /*  ImageView peter = (ImageView) findViewById(R.id.peter);
        peter.setTranslationX(-1500);*/

    }


}
