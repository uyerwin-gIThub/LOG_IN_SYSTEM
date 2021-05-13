package com.example.login_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /*"$" views or widget variables*/
    EditText $userName;
    EditText $passWord;
    Button $btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        $userName = findViewById(R.id.userName);
        $passWord = findViewById(R.id.passWord);
        $btnLogin = findViewById(R.id.btnLogin);

        $btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] Uname={"erwin@bsit", "phegilyn@bsit", "romnick@bsit", "shaina@bsit"};
                String[] Pword={"20190111", "20190418", "20194407", "20194601"};

                String username, password;
                username = $userName.getText().toString();
                password = $passWord.getText().toString();

                if(username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "MISSING USERNAME AND PASSWORD", Toast.LENGTH_SHORT).show();
                }
                else if (username.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "ENTER USERNAME FIRST", Toast.LENGTH_SHORT).show();
                }
                else if (username.equals(Uname[0])) {
                    if (password.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "ENTER PASSWORD FIRST", Toast.LENGTH_SHORT).show();
                    }
                    else if (password.equals(Pword[0])) {
                        Intent intent = new Intent(MainActivity.this, ErwinActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "INVALID PASSWORD", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (username.equals(Uname[1])) {
                    if (password.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "ENTER PASSWORD FIRST", Toast.LENGTH_SHORT).show();
                    }
                    else if (password.equals(Pword[1])) {
                        Intent intent = new Intent(MainActivity.this, PhegilynActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "INVALID PASSWORD", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (username.equals(Uname[2])) {
                    if (password.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "ENTER PASSWORD FIRST", Toast.LENGTH_SHORT).show();
                    }
                    else if (password.equals(Pword[2])) {
                        Intent intent = new Intent(MainActivity.this, RomnickActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "INVALID PASSWORD", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (username.equals(Uname[3])) {
                    if (password.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "ENTER PASSWORD FIRST", Toast.LENGTH_SHORT).show();
                    }
                    else if (password.equals(Pword[3])) {
                        Intent intent = new Intent(MainActivity.this, ShainaActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "INVALID PASSWORD", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "INVALID USERNAME", Toast.LENGTH_SHORT).show();
                }
        }
        });
    }
}