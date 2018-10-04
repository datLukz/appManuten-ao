package com.lucas.appmanutenao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText etNome, etValor, etDescricao;
    private CheckBox cbFinalizado;
    private RadioButton rbOrcamento, rbServico;
    private Button btnSalvar;

    private Spinner spinnerCategoria;

    private ArrayAdapter adapter;
    private String[] ListaCidades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome =        (EditText) findViewById(R.id.etNome);
        etDescricao=     (EditText) findViewById(R.id.);
        etValor=        (EditText) findViewById(R.id.et);

        cbCaminhada=    (CheckBox) findViewById(R.id.cbCaminhada);
        cbCorrida=      (CheckBox) findViewById(R.id.cbCorrida);

        rbFeminino=     (RadioButton) findViewById(R.id.rbFeminino);
        rbMasculino=    (RadioButton) findViewById(R.id.rbMasculino);

        btnSalvar=      (Button)   findViewById(R.id.btnSalvar);

        spinnerCidade = (Spinner) findViewById(R.id.spCidade);
        spinnerEstado = (Spinner) findViewById(R.id.spEstado);

        spinnerCidade.setEnabled(false);

        listaCidades = new String[]{
                "Selecione um estado" };

        adapter = new ArrayAdapter( this ,
                android.R.layout.simple_list_item_1, listaCidades);
        spinnerCidade.setAdapter(adapter);


        spinnerEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                carregarCidades();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}

private void CarregarCategoria(){
    String selecione = getResources().getString(R.string.selecione);

    int posicao = spinnerCategoria.getSelectedItemPosition();
}

