package com.example.tip_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tenPercent;
    Button fifteenPercent;
    Button twentyPercent;
    Button twentyfivePercent;
    EditText editText;
    TextView textView;
    double money;
    double finalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tenPercent = (Button) findViewById(R.id.tenPercent);
        fifteenPercent = (Button) findViewById(R.id.fifteenPercent);
        twentyPercent = (Button) findViewById(R.id.twentyPercent);
        twentyfivePercent = (Button) findViewById(R.id.twentyfivePercent);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView3);

        finalAmount = 1.00;

        tenPercent.setOnClickListener(this);
        fifteenPercent.setOnClickListener(this);
        twentyPercent.setOnClickListener(this);
        twentyfivePercent.setOnClickListener(this);



    }

         @Override
    public void onClick(View view){
             money =Double.parseDouble(editText.getText().toString());
             if (view.getId() == tenPercent.getId()){
                 finalAmount = money * .10;
                 finalAmount = Math.round(finalAmount *100.0) / 100.0;
                 textView.setText("$" + finalAmount);
             }

             if (view.getId() ==fifteenPercent.getId()){
                 finalAmount = money * .15;
                 finalAmount = Math.round(finalAmount *100.0) / 100.0;
                 textView.setText("$" +finalAmount);
             }

             if (view.getId() == twentyPercent.getId()){
                 finalAmount = money * .2;
                 finalAmount = Math.round(finalAmount *100.0) / 100.0;
                 textView.setText("$" + finalAmount);
             }

             if (view.getId() == twentyfivePercent.getId()){
                 finalAmount = money * .25;
                 finalAmount = Math.round(finalAmount *100.0) / 100.0;
                 textView.setText("$" + finalAmount);
             }
    }
}