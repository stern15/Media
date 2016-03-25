package com.semasuka.media;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

      /* ImageView stewie=(ImageView) findViewById(R.id.stewie);

      if(peter.getAlpha() == 1) {
        */
        ImageView peter = (ImageView) findViewById(R.id.peter);

        Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

        if(peter.getRotation()==0)
            peter.animate().rotation(180f).setDuration(2000);
        else
            peter.animate().rotation(0f).setDuration(2000);
//        view.animate().rotation(360f).setDuration(2000);
     /*  stewie.animate().alpha(1f).setDuration(2000);


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
/*
        ImageView peter=(ImageView) findViewById(R.id.peter);
        peter.setTranslationX(-1000f);

        ImageView peter = (ImageView) findViewById(R.id.peter);
        peter.setTranslationX(-1500);*/

        /*Button peterbtn = (Button)findViewById(R.id.button);
        final ImageView peter = (ImageView) findViewById(R.id.peter);
        peterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView peter = (ImageView) findViewById(R.id.peter);

                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                if(peter.getRotation()==0)
                peter.animate().rotation(360f).setDuration(2000);
                else
                    peter.animate().rotation(0f).setDuration(2000);
            }
        });

    }*/

    }
}
