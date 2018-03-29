package com.example.alexng.mobilefintech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String age = getIntent().getStringExtra("age");
        String retireYear = getIntent().getStringExtra("retireAge");
        String yearsIncome = getIntent().getStringExtra("yearsReq");
        String incomeType = getIntent().getStringExtra("spendingBehave");










        TextView textView = (TextView) findViewById(R.id.txtResult);
        textView.setText(String.format(age + "\n" + retireYear +"\n" + yearsIncome + "\n"+ incomeType));


    }
}
