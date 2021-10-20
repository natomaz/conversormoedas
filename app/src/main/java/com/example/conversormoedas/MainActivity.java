package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtReais;
    private Button btnConversor;
    private TextView txtDolar, txtEuro, txtOuro, txtBitcoin;
    public double valorReal, valorDolar, valorEuro, valorOuro, valorBitcoin, calculo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        iniciarComponentes();
        btnConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorReal = Double.parseDouble(edtReais.getText().toString());
                valorDolar = 5.60; valorEuro = 6.52; valorOuro = 318.60; valorBitcoin = 369115.33;
                calculo = valorReal/valorDolar;
                calculo = valorReal/valorEuro;
                calculo = valorReal/valorOuro;
                calculo = valorReal/valorBitcoin;
                txtDolar.setText(String.valueOf(calculo));
                txtEuro.setText(String.valueOf(calculo));
                txtOuro.setText(String.valueOf(calculo));
                txtBitcoin.setText(String.valueOf(calculo));
            }
        });
    }

    private void iniciarComponentes() {
        edtReais = findViewById(R.id.edtReais);
        btnConversor = findViewById(R.id.btnConversor);
        txtDolar = findViewById(R.id.txtDolar);
        txtEuro = findViewById(R.id.txtEuro);
        txtOuro = findViewById(R.id.txtOuro);
        txtBitcoin = findViewById(R.id.txtBitcoin);

    }
}