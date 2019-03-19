package com.example.call_and_sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class call extends AppCompatActivity {
    EditText edittext1;
    Button call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        edittext1=(EditText)findViewById(R.id.editText1);
        call=(Button)findViewById(R.id.buttoncall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=edittext1.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }
        });
    }
}
