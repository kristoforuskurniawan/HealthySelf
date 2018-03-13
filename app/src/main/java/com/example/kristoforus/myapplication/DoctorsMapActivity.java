package com.example.kristoforus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorsMapActivity extends AppCompatActivity {

    private Intent intent;
    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_map);
        homeButton = (Button) findViewById(R.id.HomeButton);
    }

    public void goHome(View view){
        intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
