package com.example.calculadorasuma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/* Importar Libreria Suma */
import com.example.librarysuma.Suma;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText numA, numB;
    TextView txtA;
    Button btnSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = (EditText) findViewById(R.id.NumeroA);
        numB = (EditText) findViewById(R.id.NumeroB);
        txtA = (TextView) findViewById(R.id.Resultadotxt);
        btnSuma = (Button) findViewById(R.id.btnSumar);
        btnSuma.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Verificar que el evento se ha activado
        Toast.makeText(getApplicationContext(),"A presionado el Boton",Toast.LENGTH_SHORT).show();

        // Declarar valores y convertirlos a Float
        float n1,n2,res;
        n1 = Float.parseFloat(numA.getText().toString());
        n2 = Float.parseFloat(numB.getText().toString());

        // Llama al metodo y muestra el resultado
        txtA.setText("El resultado es " + Suma.sumar(n1,n2));
        Toast.makeText(getApplicationContext(),"El resultado es " + Suma.sumar(n1,n2),Toast.LENGTH_LONG).show();

        // Mostrar el valor por el Log
        Log.i("Suma",String.valueOf(Suma.sumar(n1,n2)));
    }
}