package exercicio.com.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    TextView meuTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        meuTexto = (TextView) findViewById(R.id.editText2);
        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        String umValor = outroBundle.getString("Minha chave");
        meuTexto.setText(umValor);
    }
}
