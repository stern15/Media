package com.semasuka.media;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView peter = (ImageView) findViewById(R.id.peter);

        peter.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(3000);





    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView peter = (ImageView) findViewById(R.id.peter);


        peter.setTranslationX(-1000f);
        peter.setTranslationY(-1000f);


    }
}
