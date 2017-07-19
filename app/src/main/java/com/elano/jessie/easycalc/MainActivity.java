package com.elano.jessie.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    TextView tvTotal;
    Button btnPlus, btnMinus, btnTimes, btnDivide, btnClear, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        tvTotal = (TextView) findViewById(R.id.tvTotal);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnTimes = (Button) findViewById(R.id.btnTimes);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNum1.getText().toString();
                String value2 = etNum2.getText().toString();
                double num1 = Double.parseDouble(value1);
                double num2 = Double.parseDouble(value2);
                double sum = num1 + num2;
                tvTotal.setText(String.valueOf(sum));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNum1.getText().toString();
                String value2 = etNum2.getText().toString();
                double num1 = Double.parseDouble(value1);
                double num2 = Double.parseDouble(value2);
                double diff = num1 - num2;
                tvTotal.setText(String.valueOf(diff));
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNum1.getText().toString();
                String value2 = etNum2.getText().toString();
                double num1 = Double.parseDouble(value1);
                double num2 = Double.parseDouble(value2);
                double prod = num1 * num2;
                tvTotal.setText(String.valueOf(prod));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNum1.getText().toString();
                String value2 = etNum2.getText().toString();
                double num1 = Double.parseDouble(value1);
                double num2 = Double.parseDouble(value2);
                double quot = num1 / num2;
                tvTotal.setText(String.valueOf(quot));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTotal.setText("0");
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
