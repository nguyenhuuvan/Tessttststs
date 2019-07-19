package com.poly.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.poly.lab3.model.Quiz;
import com.poly.lab3.model.Sport;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SportActivity extends AppCompatActivity {
    private TextView tvSocauhoi;
    private TextView tvCauhoi;
    private Button btnDapAn1;
    private Button btnDapAn2;
    private Button btnDapAn3;
    private Button btnDapAn4;

    private int cauhoi = 1;
    private int phantuso = 0;
    private int diemso = 0;
    Quiz example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        tvSocauhoi = (TextView) findViewById(R.id.tvSocauhoi);
        tvCauhoi = (TextView) findViewById(R.id.tvCauhoi);
        btnDapAn1 = (Button) findViewById(R.id.btnDapAn1);
        btnDapAn2 = (Button) findViewById(R.id.btnDapAn2);
        btnDapAn3 = (Button) findViewById(R.id.btnDapAn3);
        btnDapAn4 = (Button) findViewById(R.id.btnDapAn4);
        GetTask getTask = new GetTask();
        getTask.execute("http://dotplays.com/android/lab3.json");
    }

    public void next(View view) {
        phantuso += 1;
        if (phantuso + 1> example.getQuiz().getSport().size()) {
            Intent intent = new Intent(SportActivity.this,KetquaActivity.class);
            intent.putExtra("kq",diemso);
            startActivity(intent);
            Log.e("diemso: ", diemso + "");
        } else {
            cauhoi += 1;
            Log.e("phantuso: ", phantuso + "");
            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }


    }

    public void dapan1(View view) {
        if (phantuso< example.getQuiz().getSport().size()) {
            if (btnDapAn1.getText().toString().equalsIgnoreCase(example.getQuiz().getSport().get(phantuso).getAnswer())) {
                Toast.makeText(this, "Đáp án đúng", Toast.LENGTH_SHORT).show();
                diemso += 1;
                Log.e("diemso: ", diemso + "");
            } else
                Toast.makeText(this, "Đáp án sai", Toast.LENGTH_SHORT).show();
        }
        phantuso += 1;
        if (phantuso +1> example.getQuiz().getSport().size()) {
            Intent intent = new Intent(SportActivity.this,KetquaActivity.class);
            intent.putExtra("kq",diemso);
            startActivity(intent);
        } else {
            cauhoi += 1;
            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }

    }

    public void dapan2(View view) {

        if (phantuso < example.getQuiz().getSport().size()) {
            if (btnDapAn2.getText().toString().equalsIgnoreCase(example.getQuiz().getSport().get(phantuso).getAnswer())) {
                Toast.makeText(this, "Đáp án đúng", Toast.LENGTH_SHORT).show();
                diemso += 1;
                Log.e("diemso: ", diemso + "");
            } else
                Toast.makeText(this, "Đáp án sai", Toast.LENGTH_SHORT).show();
        }
        phantuso += 1;
        if (phantuso + 1 > example.getQuiz().getSport().size()) {
            Intent intent = new Intent(SportActivity.this,KetquaActivity.class);
            intent.putExtra("kq",diemso);
            startActivity(intent);
        } else {
            cauhoi += 1;
            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }
    }

    public void dapan3(View view) {


        if (phantuso < example.getQuiz().getSport().size()) {
            if (btnDapAn3.getText().toString().equalsIgnoreCase(example.getQuiz().getSport().get(phantuso).getAnswer())) {
                Toast.makeText(this, "Đáp án đúng", Toast.LENGTH_SHORT).show();
                diemso += 1;
                Log.e("diemso: ", diemso + "");
            } else
                Toast.makeText(this, "Đáp án sai", Toast.LENGTH_LONG).show();
        }
        phantuso += 1;
        if (phantuso + 1 > example.getQuiz().getSport().size()) {
            Intent intent = new Intent(SportActivity.this,KetquaActivity.class);
            intent.putExtra("kq",diemso);
            startActivity(intent);
        } else {
            cauhoi += 1;
            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }
    }

    public void dapan4(View view) {
        if (phantuso < example.getQuiz().getSport().size()) {
            if (btnDapAn4.getText().toString().equalsIgnoreCase(example.getQuiz().getSport().get(phantuso).getAnswer())) {
                Toast.makeText(this, "Đáp án đúng", Toast.LENGTH_SHORT).show();
                diemso += 1;
                Log.e("diemso: ", diemso + "");
            } else
                Toast.makeText(this, "Đáp án sai", Toast.LENGTH_SHORT).show();
        }
        phantuso += 1;
        if (phantuso + 1 > example.getQuiz().getSport().size()) {
            Intent intent = new Intent(SportActivity.this,KetquaActivity.class);
            intent.putExtra("kq",diemso);
            startActivity(intent);
        } else {
            cauhoi += 1;
            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }
    }

    public class GetTask extends AsyncTask<String, Long, String> {

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                Scanner scanner = new Scanner(inputStream);
                String data = "";
                while (scanner.hasNext()) {
                    data = data + scanner.nextLine();
                }
                scanner.close();
                return data;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            example = new Gson().fromJson(s, new TypeToken<Quiz>() {
            }.getType());

            tvSocauhoi.setText("Câu hỏi: " + cauhoi);
            tvCauhoi.setText(example.getQuiz().getSport().get(phantuso).getQuestion());
            btnDapAn1.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(0));
            btnDapAn2.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(1));
            btnDapAn3.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(2));
            btnDapAn4.setText(example.getQuiz().getSport().get(phantuso).getOptions().get(3));
        }
    }
}
