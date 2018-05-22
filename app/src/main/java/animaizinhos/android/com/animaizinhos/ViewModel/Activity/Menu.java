package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import animaizinhos.android.com.animaizinhos.Model.DAO.SalvaAquivo;
import animaizinhos.android.com.animaizinhos.R;
import animaizinhos.android.com.animaizinhos.ViewModel.Fragment.DescricaoAnimais;
import animaizinhos.android.com.animaizinhos.ViewModel.Fragment.IdadeAnimais;
import animaizinhos.android.com.animaizinhos.ViewModel.Fragment.SonsAnimais;

public class Menu extends Activity {

    private TextView nome;

    private ImageView sonsAnimais;
    private  ImageView descricaoAnimais;
    private ImageView idadeAnimais;
    private ImageView nomeInglesAnimal;

    SalvaAquivo salvaAquivo = new SalvaAquivo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nome = (TextView) findViewById(R.id.nomeId);
        sonsAnimais = (ImageView) findViewById(R.id.img1Id);
        idadeAnimais = (ImageView) findViewById(R.id.img2Id);
        descricaoAnimais = (ImageView) findViewById(R.id.img3Id);




        // Recebe os dados enviados da tela anterior e trata.
        Bundle bundle =  getIntent().getExtras();

        if(bundle != null){
           String nomeUsuario = bundle.getString("nome");
            //nome.setText(nomeUsuario);
        }

        SharedPreferences sharedPreferences = getSharedPreferences(SalvaAquivo.ARQUIVO_PREFERENCES,0);
        String pessoaName = sharedPreferences.getString("nome", null);
        nome.setText("OLÀ " + pessoaName);

        //recupera arquivos
        //SharedPreferences sharedPreferences = getSharedPreferences(salvaAquivo.toString(),0);
        //if(sharedPreferences.contains("nome")){
        //  String nomePessoa = sharedPreferences.getString("nome", "usuario não definido");
        //  nome.setText(nomePessoa);
        //}else {
   //         nome.setText("olá, Usuario nao definido");
        //}



        sonsAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, SonsAnimais.class));
            }
        });

        idadeAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, IdadeAnimais.class));
            }
        });

        descricaoAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, DescricaoAnimais.class));
            }
        });

    }
}
