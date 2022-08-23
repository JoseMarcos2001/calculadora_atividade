package com.example.minha_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1,n2,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ADICAO=(Button) findViewById(R.id.ADICAO);
        Button SUBTRACAO=(Button) findViewById(R.id.SUBTRACAO);
        Button MULTIPLICACAO=(Button) findViewById(R.id.MULTIPLICACAO);
        Button DIVISAO=(Button) findViewById(R.id.DIVISAO);

        TextView RESULTADO=(TextView) findViewById(R.id.RESULTADO);
        EditText VALOR1=(EditText) findViewById(R.id.VALOR1);
        EditText VALOR2=(EditText) findViewById(R.id.VALOR2);

        ADICAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(VALOR1.getText().toString());
                n2=Double.parseDouble(VALOR2.getText().toString());
                resultado=n1+n2;
                RESULTADO.setText(String.valueOf(resultado));
            }
        });

        SUBTRACAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(VALOR1.getText().toString());
                n2=Double.parseDouble(VALOR2.getText().toString());
                resultado=n1-n2;
                RESULTADO.setText(String.valueOf(resultado));
            }
        });

        MULTIPLICACAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(VALOR1.getText().toString());
                n2=Double.parseDouble(VALOR2.getText().toString());
                resultado=n1*n2;
                RESULTADO.setText(String.valueOf(resultado));
            }
        });

        DIVISAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(VALOR1.getText().toString());
                n2=Double.parseDouble(VALOR2.getText().toString());
                resultado=n1/n2;
                RESULTADO.setText(String.valueOf(resultado));
            }
        });
    }
}