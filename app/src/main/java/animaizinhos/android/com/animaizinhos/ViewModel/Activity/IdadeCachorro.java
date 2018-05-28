package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import animaizinhos.android.com.animaizinhos.R;

public class IdadeCachorro extends Activity {



    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade_cachorro);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoCachorroId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeCachorroId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoCachorroId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTexto.getText().toString();
                if (textoDigitado.isEmpty() || Integer.parseInt(textoDigitado) >= 99 || Integer.parseInt(textoDigitado) <= 0 ){
                    resultadoIdade.setText("Digite um número válido");

                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultado = valorDigitado * 7;

                    resultadoIdade.setText("Seu cachorro tem " + resultado + " de idade humana");
                }
            }
        });


    }


}
