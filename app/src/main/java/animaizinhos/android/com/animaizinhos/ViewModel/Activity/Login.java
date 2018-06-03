package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import animaizinhos.android.com.animaizinhos.Model.DAO.SalvaAquivo;
import animaizinhos.android.com.animaizinhos.R;

public class Login extends Activity {


    private Button botao;
    private EditText nomeUsuario;

    SalvaAquivo salvaAquivo = new SalvaAquivo();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        botao = (Button) findViewById(R.id.botaoId);
        nomeUsuario = (EditText) findViewById(R.id.caixaNomeId);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //inicio de arquivo para salvar dados no dispositivo
                SharedPreferences sharedPreferences = getSharedPreferences(SalvaAquivo.ARQUIVO_PREFERENCES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if(nomeUsuario.getText().toString().equals("")){
                    Toast.makeText(Login.this, "Por favor,preencha o nome", Toast.LENGTH_SHORT).show();

                } else {
                    editor.putString("nome", nomeUsuario.getText().toString());
                    editor.commit();
                    editor.apply();


                    // Criando uma intent para receber os valores da caixa nome e envialos pra outra tela.
                    Intent i = new Intent(Login.this, Menu.class);
                    i.putExtra("nome",nomeUsuario.getText().toString()); // putExtra com a chave recebe os dados do campo EditText.
                    startActivity(i);
                }
            }
        });

    }

}
