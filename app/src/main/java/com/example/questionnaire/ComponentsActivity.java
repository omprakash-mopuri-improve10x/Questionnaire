package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        handleRadioBtn();
        handleCheckBoxBtn();
        handleOtherComponentsBtn();
    }

    public void handleRadioBtn() {
        Button radioBtn = findViewById(R.id.radio_btn);
        radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioActivity.class);
            startActivity(intent);
        });
    }

    public void handleCheckBoxBtn() {
        Button checkBtn = findViewById(R.id.check_btn);
        checkBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    public void handleOtherComponentsBtn() {
        Button otherComponentsBtn = findViewById(R.id.other_components_btn);
        otherComponentsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalenderActivity.class);
            startActivity(intent);
        });
    }
}