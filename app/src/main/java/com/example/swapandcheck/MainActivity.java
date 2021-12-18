package com.example.swapandcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_Check);
        ed1 = (EditText) findViewById(R.id.first_string_edit_text);
        ed2 = (EditText) findViewById(R.id.second_string_edit_text);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                String first = ed1.getText().toString();
                String second = ed2.getText().toString();

                if(first.equalsIgnoreCase(second)) {

                    i.putExtra("same", "THE SAME");
                    startActivity(i);
                }else {
                    i.putExtra("same", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });


    }

    public void onSwap(View view){
        ed1 = (EditText) findViewById(R.id.first_string_edit_text);
        ed2 = (EditText) findViewById(R.id.second_string_edit_text);
        String getfirststring = String.valueOf(ed1.getText());
        String getsecondstring = String.valueOf(ed2.getText());

        ed1.setText(getsecondstring);
        ed2.setText(getfirststring);
    }
}