package com.example.alcchallenge40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button aboutALCbtn;
    Button profilebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutALCbtn = findViewById(R.id.aboutALCbtn);
        Button profilebtn = findViewById(R.id.profilebtn);

        aboutALCbtn.setOnClickListener(this);
        profilebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aboutALCbtn:
                Toast.makeText(this, "About ALC Web Page", Toast.LENGTH_SHORT).show();
                Intent ALCintent = new Intent(this, AboutALCWebView.class);
                startActivity(ALCintent);
                break;
        }
        switch (v.getId()) {
            case R.id.profilebtn:
                Toast.makeText(this, "Welcome to MyProfile", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
                break;
        }
    }
}