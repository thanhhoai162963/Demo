package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mImg;
    Button mbtn;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImg = findViewById(R.id.img1);
        mbtn = findViewById(R.id.btnChange);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (count){
                    case 1:
                        mImg.setImageResource(R.drawable.mohinh1);
                        count++;
                        break;
                    case 2:
                        mImg.setImageResource(R.drawable.mohinh2);
                        count++;
                        break;
                    case 3:
                        mImg.setImageResource(R.drawable.mohinh3);
                        count++;
                        break;
                    case 4:
                        mImg.setImageResource(R.drawable.mohinh4);
                        count=0;
                        break;
                }
            }
        });
    }
}