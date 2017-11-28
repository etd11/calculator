package com.qniyaz.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    Button addB, subB, multB, divB, sqrtB, powB, clearB;
    EditText calcText1, calcText2, resultText;
    float op1, op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addB = (Button) findViewById(R.id.button3);
        subB = (Button) findViewById(R.id.button4);
        multB = (Button) findViewById(R.id.button5);
        divB = (Button) findViewById(R.id.button6);
        sqrtB = (Button) findViewById(R.id.button7);
        powB = (Button) findViewById(R.id.button8);
        clearB = (Button) findViewById(R.id.button9);
        calcText1 = (EditText) findViewById(R.id.editText);
        calcText2 = (EditText) findViewById(R.id.editText2);
        resultText = (EditText) findViewById(R.id.editText3);

        addB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                calcText2.getText();
                if(calcText1 == null || calcText2 == null) {
                    calcText1.setText(null);
                    calcText2.setText(null);
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    op2 = Float.parseFloat(calcText2.getText() + "");
                    resultText.setText(op1 + op2 + "");
                }
            }
        });

        subB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                calcText2.getText();
                if(calcText1 == null || calcText2 == null) {
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    op2 = Float.parseFloat(calcText2.getText() + "");
                    resultText.setText(op1 - op2 + "");
                }
            }
        });

        multB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                calcText2.getText();
                if(calcText1 == null || calcText2 == null) {
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    op2 = Float.parseFloat(calcText2.getText() + "");
                    resultText.setText(op1 * op2 + "");
                }
            }
        });

        divB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                calcText2.getText();
                if(calcText1.getText() == null || calcText2.getText() == null) {
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    op2 = Float.parseFloat(calcText2.getText() + "");
                    if(op2 == 0){
                        calcText1.setText(null);
                        calcText2.setText(null);
                        resultText.setText("Illegal operation");
                    }
                    else
                    resultText.setText(op1 / op2 + "");
                }
            }
        });

        sqrtB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                if(calcText1 == null) {
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    if(op1 >= 0) {
                        resultText.setText(sqrt(op1) + "");
                    }
                    else{
                        calcText1.setText(null);
                        calcText2.setText(null);
                        resultText.setText("Illegal operation");
                    }
                }
            }
        });

        powB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.getText();
                calcText2.getText();
                if(calcText1 == null || calcText2 == null) {
                    resultText.setText(null);
                }
                else{
                    op1 = Float.parseFloat(calcText1.getText() + "");
                    op2 = Float.parseFloat(calcText2.getText() + "");
                    resultText.setText(Math.pow(op1, op2) + "");
                }
            }
        });


        clearB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calcText1.setText(null);
                calcText2.setText(null);
                resultText.setText(null);

            }
        });


    }
}
