package com.amertk.mobilprogramlamavizeprojesi;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sms extends AppCompatActivity {

    private EditText phoneNumberEditText, descriptionEditText;
    private Button sendSmsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        phoneNumberEditText = findViewById(R.id.edit_text);
        descriptionEditText = findViewById(R.id.edit_text2);
        sendSmsButton = findViewById(R.id.button);

        sendSmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSms();
            }
        });
    }

    private void sendSms() {
        String phoneNumber = phoneNumberEditText.getText().toString().trim();
        String description = descriptionEditText.getText().toString().trim();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber, null, description, null, null);
            showToast("SMS sent successfully");
        } catch (Exception e) {
            showToast("Failed to send SMS");
            e.printStackTrace();
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}