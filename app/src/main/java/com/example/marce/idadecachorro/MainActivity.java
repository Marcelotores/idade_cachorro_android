package com.example.marce.idadecachorro;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by marce on 29/09/2017.
 */

public class MainActivity extends Activity {

    private EditText editText;
    private TextView getIdade;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converterIdade(View view) {
        this.editText = findViewById(R.id.editText);
        this.getIdade = findViewById(R.id.idade);
        int id = Integer.parseInt(this.editText.getText().toString());
        int idadeHumana = id * 7;

        this.getIdade.setText("A idade do seu cachorro em anos humanos é: " +  idadeHumana);


    }

}
