package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EdN1;
    EditText EdN2;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdN1 = findViewById(R.id.EdN1);
        EdN2 = findViewById(R.id.EdN2);
    }
    public void openSecond(View view){
        Intent intent = new Intent( this,SecondActivity.class);
        intent.putExtra("n1", EdN1.getText().toString());
        intent.putExtra("n2", EdN2.getText().toString());


        Toast.makeText(this, "Opening Calculator..", Toast.LENGTH_SHORT).show();
        startActivity(intent);}
}