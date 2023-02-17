package com.example.background_changer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        ConstraintLayout h = findViewById(R.id.home);
        int[] back_images = new int[]{R.drawable.k, R.drawable.k2,  R.drawable.k3, R.drawable.k4, R.drawable.d1, R.drawable.d2, R.drawable.d3};
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random color = new Random();
                h.setBackgroundColor(Color.argb(255, color.nextInt(255), color.nextInt(255), color.nextInt(255)));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int array_length = back_images.length;
                Random random = new Random();
                int random_number = random.nextInt(array_length);
                h.setBackground(ContextCompat.getDrawable(getApplicationContext(), back_images[random_number]));
            }
        });
    }
}