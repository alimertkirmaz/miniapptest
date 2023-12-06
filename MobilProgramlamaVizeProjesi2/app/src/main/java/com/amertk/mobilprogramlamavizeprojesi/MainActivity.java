package com.amertk.mobilprogramlamavizeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSms();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConvertor();
            }
        });
    }
    public void openRandom(){
        Intent intent = new Intent(this, Random.class);
        startActivity(intent);
    }
    public void openConvertor() {
        Intent intent = new Intent(this, Convertor.class);
        startActivity(intent);
    }
    public void openSms() {
        Intent intent = new Intent(this, Sms.class);
        startActivity(intent);
    }
}