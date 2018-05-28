package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import animaizinhos.android.com.animaizinhos.Model.DAO.SalvaAquivo;
import animaizinhos.android.com.animaizinhos.R;

public class Menu extends Activity {

    private TextView nome;

    GridLayout mainGrid;

    private ImageView sonsAnimais;
    private  ImageView descricaoAnimais;
    private ImageView idadeAnimais;
    private ImageView nomeInglesAnimais;

    SalvaAquivo salvaAquivo = new SalvaAquivo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //nome = (TextView) findViewById(R.id.nomeId);
        //sonsAnimais = (ImageView) findViewById(R.id.card1Id);
        //idadeAnimais = (ImageView) findViewById(R.id.card2Id);
        //descricaoAnimais = (ImageView) findViewById(R.id.card3Id);
        //nomeInglesAnimais = (ImageView) findViewById(R.id.card4Id);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);




        // Recebe os dados enviados da tela anterior e trata.
        //Bundle bundle =  getIntent().getExtras();

        //if(bundle != null){
          // String nomeUsuario = bundle.getString("nome");
            //nome.setText(nomeUsuario);
        //}

        SharedPreferences sharedPreferences = getSharedPreferences(SalvaAquivo.ARQUIVO_PREFERENCES,0);
        String pessoaName = sharedPreferences.getString("nome", null);
        nome.setText("OLÀ " + pessoaName.toUpperCase());

        //recupera arquivos
        //SharedPreferences sharedPreferences = getSharedPreferences(salvaAquivo.toString(),0);
        //if(sharedPreferences.contains("nome")){
        //  String nomePessoa = sharedPreferences.getString("nome", "usuario não definido");
        //  nome.setText(nomePessoa);
        //}else {
   //         nome.setText("olá, Usuario nao definido");
        //}


        public void setSingleEvent (GridLayout mainGrid) {
            for(int i = 0; i<mainGrid.getChildCount(); i++ ){

            }
        }


        //sonsAnimais.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
              //  startActivity(new Intent(Menu.this, SonsAnimais.class));
            //}
        //});

        //idadeAnimais.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
            //    startActivity(new Intent(Menu.this, IdadeAnimais.class));
            //}
        //});

        //descricaoAnimais.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  startActivity(new Intent(Menu.this, DescricaoAnimais.class));
            //}
        //});

        //nomeInglesAnimais.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
            //    startActivity(new Intent(Menu.this, NomeInglesAnimais.class));
            //}
        //});

    }


}
