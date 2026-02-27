package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView txtCityName = findViewById(R.id.text_city_name);
        Button btnBack = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra(EXTRA_CITY_NAME);

        if (cityName == null) {
            cityName = "";
        }

        txtCityName.setText(cityName);

        btnBack.setOnClickListener(v -> finish());
    }
}