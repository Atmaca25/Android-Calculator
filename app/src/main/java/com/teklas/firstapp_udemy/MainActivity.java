package com.teklas.firstapp_udemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textSummary,textNumberOne,textNumberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumberTwo = findViewById(R.id.editTextNumber2);
        textNumberOne = findViewById(R.id.editTextNumber1);
        textSummary = findViewById(R.id.calculatedSummary);
    }

    public void  btnSumOnClick(View view)
    {
        if(textNumberOne.getText().toString().matches("[a-zA-Z ]+") || textNumberOne.getText().toString().length() == 0)
        {
            textNumberOne.requestFocus();
            textNumberOne.setError("Enter Only Number");
        }
        else if (textNumberTwo.getText().toString().matches("[a-zA-Z ]+") || textNumberTwo.getText().toString().length() == 0)
        {
            textNumberTwo.requestFocus();
            textNumberTwo.setError("Enter Only Number");
        }
        else {
            int numberOne = Integer.parseInt(textNumberOne.getText().toString());
            int numberTwo = Integer.parseInt(textNumberTwo.getText().toString());
            int result = numberOne + numberTwo;
            textSummary.setText(String.valueOf(result));
        }
    }

    public  void btnMultiplyOnClick(View view)
    {
        int numberOne = Integer.parseInt(textNumberOne.getText().toString());
        int numberTwo = Integer.parseInt(textNumberTwo.getText().toString());
        int result = numberOne * numberTwo;
        textSummary.setText(String.valueOf(result));
    }

    public  void btnDivisionOnClick(View view)
    {
        int numberOne = Integer.parseInt(textNumberOne.getText().toString());
        int numberTwo = Integer.parseInt(textNumberTwo.getText().toString());
        int result = numberOne / numberTwo;
        textSummary.setText(String.valueOf(result));
    }

    public  void btnMinusOnClick(View view)
    {
        int numberOne = Integer.parseInt(textNumberOne.getText().toString());
        int numberTwo = Integer.parseInt(textNumberTwo.getText().toString());
        int result = numberOne - numberTwo;
        textSummary.setText(String.valueOf(result));
    }
}