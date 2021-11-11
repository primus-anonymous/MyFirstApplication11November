package com.neocaptainnemo.myfirstapplication11november;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_comparator);

        EditText firstDigit = findViewById(R.id.first_digit);
        EditText secondDigit = findViewById(R.id.second_digit);

        Button compareButton = findViewById(R.id.btn_compare);
        TextView textResult = findViewById(R.id.txt_result);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstDigitInput = firstDigit.getText().toString();
                String secondDigitInput = secondDigit.getText().toString();

                try {

                    Integer firstInt = Integer.valueOf(firstDigitInput);
                    Integer secondInt = Integer.valueOf(secondDigitInput);

                    Log.v("Comparator", "Comparing " + firstDigitInput + " and " + secondDigitInput);

                    if (firstInt.equals(secondInt)) {
                        textResult.setText("The numbers are equal!");
                    } else {
                        textResult.setText("The numbers are not equal!");
                    }
                } catch (NumberFormatException exception) {
                    textResult.setText("You seem to be a dumbass!");
                }
            }
        });
    }
}