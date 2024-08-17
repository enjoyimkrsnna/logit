package com.example.logit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView txttitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txttitle = findViewById(R.id.texttitle);
         txttitle.setSelected(true);
    }

    public void dashboard_1(View view) {
        Intent i = new Intent(this,activity_log.class);
        startActivity(i);

    }

    public void dashboard_2(View view) {
        Intent i = new Intent(this,activity_antilog.class);
        startActivity(i);

    }

    public void dashboard_3(View view) {
        Intent i = new Intent(this,about_log_and_antilog.class);
        startActivity(i);

    }

}