package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView first,firstway, second, secondWay, third, thirdWay ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first);
        firstway = findViewById(R.id.firstWay);
        second = findViewById(R.id.second);
        secondWay = findViewById(R.id.seconddWay);
        third = findViewById(R.id.third);
        thirdWay = findViewById(R.id.thirdWar);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hellooooooo", Toast.LENGTH_SHORT).show();
            }
        });

        firstway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hiiiiiiiiiiii", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.second:
                Toast.makeText(this, "th kaise hai aaap logan", Toast.LENGTH_SHORT).show();
                break;

            case R.id.seconddWay:
                Toast.makeText(this, "Good morning", Toast.LENGTH_SHORT).show();
                break;

        }
    }


    public void ThirdWayBtn(View view) {
        Toast.makeText(this, "Hmmmmmmmmm", Toast.LENGTH_SHORT).show();
    }

    public void thirdBtn(View view) {
        Toast.makeText(this, "How are you", Toast.LENGTH_SHORT).show();
    }
}