package com.example.galibtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double num1,num2,answer;
    EditText num1Edit,num2Edit;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1Edit = findViewById(R.id.fNumId);
        num2Edit = findViewById(R.id.sNumId);
        result = findViewById(R.id.displayId);

    }

    public void divideFunction(View view) {
        num1 = Double.parseDouble(num1Edit.getText().toString());
        num2 = Double.parseDouble(num2Edit.getText().toString());
        answer=num1/num2;
        result.setText(answer.toString());


    }

    public void mulFunction(View view) {
        num1 = Double.parseDouble(num1Edit.getText().toString());
        num2 = Double.parseDouble(num2Edit.getText().toString());
        answer=num1*num2;
        result.setText(answer.toString());
    }

    public void minusFunction(View view) {
        num1 = Double.parseDouble(num1Edit.getText().toString());
        num2 = Double.parseDouble(num2Edit.getText().toString());
        answer=num1-num2;
        result.setText(answer.toString());
    }

    public void plusFunction(View view) {
        num1 = Double.parseDouble(num1Edit.getText().toString());
        num2 = Double.parseDouble(num2Edit.getText().toString());
        answer=num1+num2;
        result.setText(answer.toString());
    }
}