package com.example.swapandcheck;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent SecondActivity = getIntent();
        t =(TextView) findViewById(R.id.msg_text_view);
        String result = SecondActivity.getStringExtra("same");
        t.setText(result);

        }


}
