package com.amertk.mobilprogramlamavizeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.os.Bundle;

public class Convertor extends AppCompatActivity {

    private Button cToK, cToF;
    private TextView result;
    private EditText enterTemp;
    double result1;
    private Button mbToKiloByte, mbToByte, mbToKibiByte, mbToBit;
    private TextView result2;
    private EditText enterTemp1;
    double result3;
    private Button dToBinary, dToOctal, dToHexadecimal;
    private TextView result4;
    private EditText enterTemp2;
    double result5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);
        cToK = findViewById(R.id.cToK);
        cToF = findViewById(R.id.cToF);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);
        mbToKiloByte = findViewById(R.id.mbToKiloByte);
        mbToByte = findViewById(R.id.mbToByte);
        mbToKibiByte = findViewById(R.id.mbToKibiByte);
        mbToBit = findViewById(R.id.mbToBit);
        result2 = findViewById(R.id.result2);
        enterTemp1 = findViewById(R.id.enterTemp1);
        dToBinary = findViewById(R.id.dToBinary);
        dToOctal = findViewById(R.id.dToOctal);
        dToHexadecimal = findViewById(R.id.dToHexadecimal);
        result4 = findViewById(R.id.result4);
        enterTemp2 = findViewById(R.id.enterTemp2);

        cToK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result1 = temp + 273.15;
                result.setText(String.valueOf(result1));
            }
        });
        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result1 = (temp * 1.8) + 32;
                result.setText(String.valueOf(result1));
            }
        });
        mbToKiloByte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double temp = Double.parseDouble(enterTemp1.getText().toString());
                    result3 = temp * 1000;
                    result2.setText(String.valueOf(result3));
                }
        });
        mbToByte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double temp = Double.parseDouble(enterTemp1.getText().toString());
                    result3 = temp * 1000000;
                    result2.setText(String.valueOf(result3));
                }
        });
        mbToKibiByte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp1.getText().toString());
                result3 = temp * 1000000000;
                result2.setText(String.valueOf(result3));
            }
        });
        mbToBit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp1.getText().toString());
                result3 = (temp * 1000000000) * 1000;
                result2.setText(String.valueOf(result3));
            }
        });
        dToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp2.getText().toString());
                result5 = 0;
                result4.setText(String.valueOf(result5));
            }
        });
        dToOctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp2.getText().toString());
                result5 = 0;
                result4.setText(String.valueOf(result5));
            }
        });
        dToHexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp2.getText().toString());
                result5 = 0;
                result4.setText(String.valueOf(result5));
            }
        });
    }
}