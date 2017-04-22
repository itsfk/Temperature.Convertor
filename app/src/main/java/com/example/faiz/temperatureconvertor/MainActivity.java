package com.example.faiz.temperatureconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText temp;
    Button btn1;
    Button btn2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.textView);
    temp=(EditText)findViewById(R.id.editText);
        btn1=(Button)findViewById(R.id.c2F);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value= Double.parseDouble(temp.getText().toString());
                value=UnitConvertor.CelsiusToFarenhit(value);
                txt.setText(String.valueOf(value));
            }
        });
        btn2=(Button)findViewById(R.id.f2C);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value= Double.parseDouble(temp.getText().toString());
               value=UnitConvertor.FarenhitToCelsius(value);
                txt.setText(String.valueOf(value));

            }
        });


    }


}
