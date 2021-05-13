package com.example.login_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PhegilynActivity extends AppCompatActivity {

    Button $btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phegilyn);

        $btnLogout = findViewById(R.id.btnLogout);

        $btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhegilynActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}