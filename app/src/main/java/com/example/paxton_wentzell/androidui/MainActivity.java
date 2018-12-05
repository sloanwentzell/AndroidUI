package com.example.paxton_wentzell.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public ImageView imageView;
    public TextView textView;
    public EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.sps);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);


    }


}
