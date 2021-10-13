package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        //Finding my check boxes
        CheckBox in1 = findViewById(R.id.inInput);
        CheckBox ft1 = findViewById(R.id.ftInput);
        CheckBox yd1 = findViewById(R.id.ydInput);
        CheckBox mile1 = findViewById(R.id.mileInput);
        CheckBox mm1 = findViewById(R.id.mmInput);
        CheckBox cm1 = findViewById(R.id.cmInput);
        CheckBox m1 = findViewById(R.id.mInput);
        CheckBox km1 = findViewById(R.id.kmInput);

        CheckBox in2 = findViewById(R.id.inInput2);
        CheckBox ft2 = findViewById(R.id.ftInput2);
        CheckBox yd2 = findViewById(R.id.ydInput2);
        CheckBox mile2 = findViewById(R.id.mileInput2);
        CheckBox mm2 = findViewById(R.id.mmInput2);
        CheckBox cm2 = findViewById(R.id.cmInput2);
        CheckBox m2 = findViewById(R.id.mInput2);
        CheckBox km2 = findViewById(R.id.kmInput2);

        double valueInches = 0;
        double valueInput = 0;
        double valueOutput = 0;
        String outputType = "";

        //getting my text input and output
        EditText input = findViewById(R.id.input);
        TextView output = findViewById(R.id.textOutput);
        //convert input into a string
        String number = input.getText().toString();
        //try converting the string to a double
        try {
            valueInput = Double.parseDouble(number);
        }
        catch(Exception e){
            output.setText("Input a number please");
            return;
        }

        if(in1.isChecked())
            valueInches = valueInput;
        else if(ft1.isChecked())
            valueInches = feetToInch(valueInput);

        else if(yd1.isChecked())
            valueInches = yardsToInch(valueInput);

        else if(mile1.isChecked())
            valueInches = milesToInch(valueInput);

        else if(mm1.isChecked())
            valueInches = millimetersToInch(valueInput);

        else if(cm1.isChecked())
            valueInches = centimetersToInch(valueInput);

        else if(m1.isChecked())
            valueInches = metersToInch(valueInput);

        else if(km1.isChecked())
            valueInches = kilometersToInch(valueInput);
        else
        {
            output.setText("Select an input type");
            return;
        }

        if(in2.isChecked()) {
            valueOutput = valueInches;
            outputType = "Inches";
        }
        else if(ft2.isChecked()) {
            valueOutput = inchToFeet(valueInches);
            outputType = "Feet";
        }
        else if(yd2.isChecked()) {
            valueOutput = inchToYards(valueInches);
            outputType = "Yards";
        }
        else if(mile2.isChecked()) {
            valueOutput = inchToMiles(valueInches);
            outputType = "Miles";
        }
        else if(mm2.isChecked()) {
            valueOutput = inchToMillimeters(valueInches);
            outputType = "Millimeters";
        }
        else if(cm2.isChecked()) {
            valueOutput = inchToCentimeters(valueInches);
            outputType = "Centimeters";
        }
        else if(m2.isChecked()) {
            valueOutput = inchToMeters(valueInches);
            outputType = "Meters";
        }
        else if(km2.isChecked()) {
            valueOutput = inchToKilometers(valueInches);
            outputType = "Kilometers";
        }
        else
        {
            output.setText("Select an output type");
            return;
        }

        valueOutput = Math.round(valueOutput);
        output.setText(valueOutput + " " + outputType);
    }


    public static double feetToInch(double a) {
        return(a * 12);
    }
    public static double yardsToInch(double a) {
        return (a * 36);
    }
    public static double milesToInch(double a) {
        return (a * 63360);
    }
    public static double millimetersToInch(double a) {
        return(a / 25.4);
    }
    public static double centimetersToInch(double a) {
        return(a / 2.54);
    }
    public static double metersToInch(double a) {
        return(a * 39.37);
    }
    public static double kilometersToInch(double a) {
        return(a * 39370);
    }
    public static double inchToFeet(double a) {
        return(a / 12);
    }
    public static double inchToYards(double a) {
        return (a / 36);
    }
    public static double inchToMiles(double a) {
        return (a / 63360);
    }
    public static double inchToMillimeters(double a) {
        return(a * 25.4);
    }
    public static double inchToCentimeters(double a) {
        return(a * 2.54);
    }
    public static double inchToMeters(double a) {
        return(a / 39.37);
    }
    public static double inchToKilometers(double a) {
        return(a / 39370);
    }
}


