package com.example.ty_19_demoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button botonSaludar, botonReset;
    private EditText editNombre;
    private TextView textSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSaludar = findViewById(R.id.botonSaludar);
        editNombre = findViewById(R.id.editNombre);
        botonReset = findViewById(R.id.botonReset);
        textSaludo = findViewById(R.id.textSaludo);

    }

    public void saludar(View v){
        if(editNombre.getText().toString().isEmpty()){
            Toast.makeText(this, "Tiene que ingresar su nombre", Toast.LENGTH_SHORT).show();
            // Log.i("SALUDO", "saludar: ");
        }else{
            // el usuario no ingreso su nombre
            textSaludo.setText("BIenvenido "+editNombre.getText().toString());
        }

    }

    public void reset(View v){

    }
}
