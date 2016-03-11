package com.example.chris.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText texto1, texto2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //metodo Heredado de la clase AppCompat, me inicia el layout al iniciarl el programa
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (EditText)findViewById(R.id.et1); //se enlazan las variables con los objetos puestos en el xml gracias al metodo find.....
        texto2 = (EditText)findViewById(R.id.et2);
        result = (TextView)findViewById(R.id.tv1);
        //objetos texto1 texto2 tipo EditText y result tipo TextView enlazados con sus respectivos objetos en el layout


    }

    public void sumar(View claseView){
        String valor1 = texto1.getText().toString();
        String valor2 = texto2.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int suma = n1 + n2;
        String resul = String.valueOf(suma);
        result.setText(resul);


    }



}
