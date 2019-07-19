package com.poly.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KetquaActivity extends AppCompatActivity {
    private TextView tvKq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        tvKq = (TextView) findViewById(R.id.tvKq);

        tvKq.setText("Kết quả: "+getIntent().getIntExtra("kq",0)+"/2");
    }
}
