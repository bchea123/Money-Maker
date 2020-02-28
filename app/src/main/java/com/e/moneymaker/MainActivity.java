package com.e.moneymaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView txtMoney;
    private Button btnAddMoney;
    private int moneyCounter = 0;
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddMoney = findViewById(R.id.btnAddMoney);
        txtMoney = findViewById(R.id.txtMoney);
        btnAddMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moneyCounter += 5;
                txtMoney.setText(String.valueOf(currency.format(moneyCounter)));

                if(moneyCounter > 100 && moneyCounter <= 200){
                    Toast.makeText(getApplicationContext(), "Woah, u rich", Toast.LENGTH_SHORT).show();
                }
                else if(moneyCounter > 200 && moneyCounter <= 300){
                    Toast.makeText(getApplicationContext(), "Woah, u supa rich", Toast.LENGTH_SHORT).show();
                }
                else if(moneyCounter > 300){
                    Toast.makeText(getApplicationContext(), "Woah, u big balla", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
