package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn01;
    private EditText ednumero;
    private TextView textaña;
    private EditText porcentnumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednumero = findViewById(R.id.txtNumero);
        porcentnumero = findViewById(R.id.porcent);
        btn01 = findViewById(R.id.btnCalcular);
        textaña = findViewById(R.id.result);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    // Obtén el número ingresado y el porcentaje de descuento
                    double numero = Double.parseDouble(ednumero.getText().toString());
                    double porcentajeDescuento = Double.parseDouble(porcentnumero.getText().toString());

                    // Calcula el descuento
                    double descuento = (numero * porcentajeDescuento) /100;
                    double resultadoConDescuento = numero - descuento;

                    // Muestra el resultado con descuento en el TextView "Resultado"
                    textaña.setText("Resultado con descuento: " + resultadoConDescuento);
                } catch (NumberFormatException e) {
                    // Manejo de error en caso de que la entrada no sea válida
                    textaña.setText("Ingrese números válidos en ambos campos.");
                }
            }
        });
    }
}

// tengo que ver a que descuento le corresponde 
