package com.semasuka.media;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView Peter=(ImageView) findViewById(R.id.Peter);
        ImageView Stewie=(ImageView) findViewById(R.id.Stewie);


        Stewie.animate().alpha(1f).setDuration(2000);
        Peter.animate().alpha(0f).setDuration(2000);





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
