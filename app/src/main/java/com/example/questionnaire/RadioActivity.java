package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        handleVerifyBtn();
    }

    public void handleVerifyBtn() {
        Button verifyBtn1 = findViewById(R.id.verify_btn1);
        verifyBtn1.setOnClickListener(view -> {
            RadioButton radioBtn10 = findViewById(R.id.radio_btn10);
            if (radioBtn10.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioBtn8 = findViewById(R.id.radio_btn8);
            if (radioBtn8.isChecked()) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioBtn12 = findViewById(R.id.radio_btn12);
            if (radioBtn12.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioBtn9 = findViewById(R.id.radio_btn9);
            if (radioBtn9.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}