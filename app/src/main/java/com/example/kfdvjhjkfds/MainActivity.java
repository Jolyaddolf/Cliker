package com.example.kfdvjhjkfds;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button clickButton;
    Button minusClick;
    TextView TextClick;

    ImageView cot1;
    ImageView cot2;

    private long score = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextClick = (TextView) findViewById(R.id.TextClick);
        clickButton = (Button) findViewById(R.id.clickButton);
        minusClick = (Button) findViewById(R.id.minusClick);

        clickButton.setOnClickListener(clickListener);
        minusClick.setOnClickListener(clickListener2);

    };






    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score++;
            String s = "Кликов: " + score;

            TextClick.setText(s.toCharArray(), 0, s.length());
            ImageView cat1 = findViewById(R.id.cat1);
            if (score == 10) {
                cat1.setImageResource(R.drawable.images__1_);
            } else if (score == 21) {
                cat1.setImageResource(R.drawable.catyeas);

            }


        }
    };
    View.OnClickListener clickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score--;
            String s = "Кликов: " + score;
            TextClick.setText(s.toCharArray(), 0, s.length());
            ImageView cat1 = findViewById(R.id.cat1);
            if (score ==9)
            {
                cat1.setImageResource(R.drawable.images);
            }
            else if(score == 19)
            {
                cat1.setImageResource(R.drawable.images__1_);
            }



        }



    };














}

