package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        TextView CityName = findViewById(R.id.Cityname);
        CityName.setText(intent.getStringExtra("value"));
        Button back = findViewById(R.id.btn_Back);
        //set listener on button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShowActivity.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}