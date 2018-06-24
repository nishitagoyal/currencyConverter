package com.example.goyal.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

EditText editText;
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText = findViewById(R.id.edit);
        textView = findViewById(R.id.text);
        button = findViewById(R.id.button1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = editText.getText().toString();
//                double num=Double.parseDouble(name);
//                double dollar = num/60;
//                String result = Double.toString(dollar);
//                textView.setText(result);
//            }
//        });

    }
    public void converter (View view){
        String name = editText.getText().toString();
        double num=Double.parseDouble(name);
        double dollar = num/60;
        String result = Double.toString(dollar);
        textView.setText(result);
    }

}
