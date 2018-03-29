package com.example.alexng.mobilefintech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


public class Investment extends AppCompatActivity {
    SeekBar skBar, skBarRetire, skYearsRequired;
    EditText txtAge, txtRetireAge, txtYearsIncome;
    Spinner ddlSpendType;
    Button button;
    int age,retireAge,yearsIncome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment);
        skBar = (SeekBar) findViewById(R.id.seekbarAge);
        skBarRetire = (SeekBar) findViewById(R.id.seekbarRetireAge);
        skYearsRequired = (SeekBar) findViewById(R.id.seekbarYearsRequired);
        ddlSpendType = (Spinner) findViewById(R.id.ddlSpendingBehave);
        Spinner spinner = (Spinner) findViewById(R.id.ddlSpendingBehave);
        Button button = (Button) findViewById(R.id.btnCalculate);
        final EditText age = (EditText) findViewById(R.id.txtAge);
        final EditText retireAge = (EditText) findViewById(R.id.txtRetireAge);
        final EditText yearsReq = (EditText) findViewById(R.id.txtYearsIncome);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ddlSpendingBehave, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Result.class);
                /*Bundle bundleData = new Bundle();
                bundleData.putInt("AGE", Integer.getInteger(String.valueOf(age)));
                bundleData.putInt("RETIREAGE", Integer.getInteger(String.valueOf(retireAge)));
                bundleData.putInt("YEARSINCOME", Integer.getInteger(String.valueOf(yearsReq)));
                bundleData.putString("SPENDINGBEHAVIOR", String.valueOf(ddlSpendType.getSelectedItem()));*/
                intent.putExtra("age", (CharSequence) age.getText().toString());
                intent.putExtra("retireAge", (CharSequence)retireAge.getText().toString());
                intent.putExtra("yearsReq", (CharSequence)yearsReq.getText().toString());
                intent.putExtra("spendingBehave", ddlSpendType.getSelectedItem().toString());

                startActivity(intent);

            }
        });

        /*txtAge = (TextView) findViewById(R.id.txtAge);
        txtAge.addTextChangedListener(new TextWatcher() {
            String age;
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                *//*age = (String) txtAge.getText();
                skBar.setProgress(Integer.parseInt(age));*//*

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/

        skBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 20;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /*TextView txtRetireAge = (TextView) findViewById(R.id.txtRetireAge);*/
                TextView txtAge = (TextView) findViewById(R.id.txtAge);
               /* if(Integer.parseInt(txtAge.getText()>(Integer)txtAge.getText()){
                    progressChangedValue = progress;
                }*/


                /*txtAge.setText(String.valueOf(progressChangedValue));*/


                    progressChangedValue = progress;




                txtAge.setText(String.valueOf(progressChangedValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        skBarRetire.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 20;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                TextView txtRetireAge = (TextView) findViewById(R.id.txtRetireAge);
                txtRetireAge.setText(String.valueOf(progressChangedValue + 20));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        skYearsRequired.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 20;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                TextView txtYearsRequired = (TextView) findViewById(R.id.txtYearsIncome);
                txtYearsRequired.setText(String.valueOf(progressChangedValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }




}

