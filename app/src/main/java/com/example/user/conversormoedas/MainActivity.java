package com.example.user.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// 4 - Setando a activity para implementar a interface View, para implementar o click
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 2 - Instancia da classe ViewHolder
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3 - Recuperando os elementos da interface (findViewById)
        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDollar = findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        // 5 - Setando o botão para implementar o click
        this.mViewHolder.buttonCalculate.setOnClickListener(this);

        // 8 - Método que seta os valores em dolar e euro vazios, ao iniciar o app
        this.clearValues();

    }

    // 6 - Implementando método obrigatório da Interface View
    @Override
    public void onClick(View v) {
        // Verificando qual elemento executou o click, através do seu id
        int id = v.getId();
        if (id == R.id.button_calculate) {
            // Teste: alterar o texto do botão ao ser clicado
            //this.mViewHolder.buttonCalculate.setText("Teste");
            // 7 - Lógica do botão para converter o valor
            Double value = Double.valueOf(this.mViewHolder.editValue.getText().toString());
            Double dollar = value * 3;
            Double euro = value * 4;
            this.mViewHolder.textDollar.setText(String.format("%.2f", dollar));
            this.mViewHolder.textEuro.setText(String.format("%.2f", euro));
        }
    }

    // 8.1 - Implementando método clearValues
    private void clearValues() {
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    // 1 - Classe que engloba todos os atributos
    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }

}
