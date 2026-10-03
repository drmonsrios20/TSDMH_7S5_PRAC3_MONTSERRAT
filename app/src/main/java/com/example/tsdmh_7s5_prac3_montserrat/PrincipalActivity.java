package com.example.tsdmh_7s5_prac3_montserrat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnombre, txtedad;
    Button btnsaluda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        btnsaluda = findViewById(R.id.btnsaluda);
        btnsaluda.setOnClickListener(v -> {
            Toast.makeText(this, "Bienvenido " + txtnombre.getText().toString(), Toast.LENGTH_SHORT).show();
            AlertDialog.Builder mensajecaja = new AlertDialog.Builder(this);
            mensajecaja.setMessage("Bienvenido " + txtnombre.getText().toString())
                    .setTitle("Mensaje")
                    .setPositiveButton(R.string.Dialogook, (dialogInterface, i) -> {

                    });
            AlertDialog dialogo = mensajecaja.create();
            dialogo.show();
        });
    }
}