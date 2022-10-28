package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        handleVerifyBtn();
    }

    public void handleVerifyBtn() {
        Button verifyBtn2 = findViewById(R.id.verify_btn2);
        verifyBtn2.setOnClickListener(view -> {
            CheckBox mercuryCb = findViewById(R.id.mercury_cb);
            CheckBox sunCb = findViewById(R.id.sun_cb);
            CheckBox moonCb = findViewById(R.id.moon_cb);
            CheckBox jupiterCb = findViewById(R.id.jupiter_cb);
            CheckBox saturnCb = findViewById(R.id.saturn_cb);
            CheckBox plutoCb = findViewById(R.id.pluto_cb);
            if (mercuryCb.isChecked() && jupiterCb.isChecked() && saturnCb.isChecked() &&  sunCb.isChecked() == false && moonCb.isChecked() == false && plutoCb.isChecked() == false) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else if (mercuryCb.isChecked() == false && jupiterCb.isChecked() == false && saturnCb.isChecked()  == false &&  sunCb.isChecked() == false && moonCb.isChecked() == false && plutoCb.isChecked() == false) {
                Toast.makeText(this, "Please select the options", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}