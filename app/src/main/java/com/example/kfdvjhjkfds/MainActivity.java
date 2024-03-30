package com.example.kfdvjhjkfds;

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
    TextView TextClick;

    ImageView cot1;
    ImageView cot2;

    private long score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextClick = (TextView) findViewById(R.id.TextClick);
        clickButton = (Button) findViewById(R.id.clickButton);

        clickButton.setOnClickListener(clickListener);

    };






    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            score++;
             String s = "Кликов: " + score;

             TextClick.setText(s.toCharArray(),0, s.length());
            ImageView cat1 = findViewById(R.id.cat1);
             if (score == 10)
             {
                 cat1.setImageResource(R.drawable.images__1_);
             }
             else if (score == 20)
             {
                 cat1.setImageResource(R.drawable.png_transparent_tabby_cat_kitten_open_cat_transparent_background_png_clipart);

             }





        }

    };





}

