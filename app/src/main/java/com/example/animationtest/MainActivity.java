package com.example.animationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Animation shake2;
    Animation open_menu;
    Animation close_menu;
    LinearLayout menu;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shake2 = AnimationUtils.loadAnimation(this, R.anim.shake);
         
        final Button shake=findViewById(R.id.shakebut);
        shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shake.startAnimation(shake2);
            }
        });




    }
}
