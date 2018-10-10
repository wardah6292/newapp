package com.example.myworld.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    EditText firstnumber;
    EditText secondnumber;
    Button add;

    double num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = (EditText) findViewById(R.id.Text1);
        secondnumber = (EditText) findViewById(R.id.Text2);
        result = (TextView) findViewById(R.id.textView1);
        add = (Button) findViewById(R.id.button1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble ( firstnumber.getText().toString());
                num2 = Double.parseDouble ( secondnumber.getText().toString());
                sum = num1 + num2;
                result.setText(Double.toString(sum));
            }
        });
    }
}
