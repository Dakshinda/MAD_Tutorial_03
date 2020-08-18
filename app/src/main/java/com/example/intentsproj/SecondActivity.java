package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText EdN1;
    EditText EdN2;

    String number1;
    String number2;

    TextView LbSum;
    int n1, n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EdN1 = findViewById(R.id.EdN1);
        EdN2 = findViewById(R.id.EdN2);
        LbSum = findViewById(R.id.LbSum);


        Intent intent = getIntent();

         number1 = intent.getStringExtra("n1");
         number2 = intent.getStringExtra("n2");

        EdN1.setText(number1);
        EdN2.setText(number2);

        n1=Integer.parseInt(number1);
        n2=Integer.parseInt(number2);
    }
    public void add(View view){
        LbSum.setText(number1 + " + " + number2 + " = " + (n1 +n2));


    } public void substract(View view){
        LbSum.setText(number1 + " - " + number2 + " = " + (n1 -n2));


    } public void multiply(View view){
        LbSum.setText(number1 + " x " + number2 + " = " + (n1 *n2));


    } public void devide(View view){
        LbSum.setText(number1 + " / " + number2 + " = " + (n1 /n2));


    }

}