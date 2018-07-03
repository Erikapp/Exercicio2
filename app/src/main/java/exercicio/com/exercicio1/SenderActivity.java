package exercicio.com.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    EditText nome;
    Button  meuBotao;
    String valorDoCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        meuBotao = (Button) findViewById(R.id.meuBotao);
        nome = (EditText) findViewById(R.id.editText2);
    }
public void botaoPressionado (View v){
    Toast.makeText(this, "Click no botão", Toast.LENGTH_SHORT).show();
    Intent meuIntent = new Intent(this, ReceptorActivity.class);
    valorDoCampo = nome.getText().toString();
    Bundle meuBundle = new Bundle();
    meuBundle.putString("Minha chave", valorDoCampo);
    meuIntent.putExtras(meuBundle);
    startActivity(meuIntent);
}
}
