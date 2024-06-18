package com.example.yanchaguano_masaquiza_examen_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
operaciones op = new operaciones();
    private EditText numA;
    private EditText numB;
    private EditText result;
    private Button buttonCalcular;
    @SuppressLint({"CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         numA= (EditText) findViewById(R.id.editTexNumA);
         numB= (EditText) findViewById(R.id.editTeXNumeroB);
         result=(EditText) findViewById(R.id.resultado);
         buttonCalcular = findViewById(R.id.button2);


    }

    public void onClick_Suamr(View view){


        String num1= numA.getText().toString();
        String num2= numB.getText().toString();

        String dato =op.sumar(num1,num2);
        //int[] numeroA={1,2,3,4,5,6,7};

        result.setText(dato);
    }
}
