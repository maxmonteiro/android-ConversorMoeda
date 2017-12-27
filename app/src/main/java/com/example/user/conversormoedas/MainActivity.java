package com.example.user.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// 4º - Setando a activity para implementar a interface View, para implementar o click
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 2º - Instancia da classe ViewHolder
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3º - Recuperando os elementos da interface (findViewById)
        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDollar = findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        // 5º - Setando o botão para implementar o click
        this.mViewHolder.buttonCalculate.setOnClickListener(this);

    }

    // 6º - Implementando método obrigatório da Interface View
    @Override
    public void onClick(View v) {
        // Verificando qual elemento executou o click, através do seu id
        int id = v.getId();
        if (id == R.id.button_calculate) {
            // Teste: alterar o texto do botão ao ser clicado
            this.mViewHolder.buttonCalculate.setText("Teste");
        }
    }

    // 1º - Classe que engloba todos os atributos
    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }

}
