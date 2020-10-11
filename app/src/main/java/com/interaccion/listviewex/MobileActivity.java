package com.interaccion.listviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MobileActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);


        tv = findViewById(R.id.tv_mobile);

        String mobile = getIntent().getStringExtra("MOB");

        tv.setText(mobile);
    }
}