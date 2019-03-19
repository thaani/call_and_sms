package com.example.call_and_sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call,sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button)findViewById(R.id.call);
        sms=(Button)findViewById(R.id.sms);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent();
                i.setClass(getApplicationContext(), call.class);
                startActivity(i);
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent();
                i.setClass(getApplicationContext(), sms.class);
                startActivity(i);
            }
        });

    }
}
