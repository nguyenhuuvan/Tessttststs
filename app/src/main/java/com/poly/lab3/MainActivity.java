package com.poly.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void sport(View view) {
        startActivity(new Intent(MainActivity.this,SportActivity.class));
    }

    public void maths(View view) {
        startActivity(new Intent(MainActivity.this,MathsActivity.class));
    }



}

