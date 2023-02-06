package com.example.homework22_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private Integer first, second, sum;
    private boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tex_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") ||  isOperationClick){
                    textView.setText("1");
               }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                 break;
            case R.id.btn_clear:
                    textView.setText("0");
                    first = 0;
                    second = 0;
                    break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                break;


            case R.id.btn_dot:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText(".");
                }else {
                    textView.append(".");
                }
                break;

            case R.id.btn_four:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                break;


            case R.id.btn_five:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                break;


            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") ||  isOperationClick)  {
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                break;



        }
        isOperationClick = false;
    }

    public void onOperationClick (View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                break;



            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                sum = first + second;
                textView.setText(sum.toString());
                break;


        }
        isOperationClick = true;

        switch (view.getId()){
            case R.id.btn_minus:




                break;
        }
        isOperationClick = true;


        switch (view.getId()){
            case R.id.btn_multiplication:
                second = Integer.valueOf(textView.getText().toString());

                break;
        }
        isOperationClick = true;


        switch (view.getId()){
            case R.id.btn_division:
                second = Integer.valueOf(textView.getText().toString());

                break;
        }
        isOperationClick = true;



        switch (view.getId()){
            case R.id.btn_percentage:
                second = Integer.valueOf(textView.getText().toString());

                break;
        }
        isOperationClick = true;


        switch (view.getId()){
            case R.id.btn_plus_minus:
                second = Integer.valueOf(textView.getText().toString());


                break;
        }
        isOperationClick = true;



    }


}



