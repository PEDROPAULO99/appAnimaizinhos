package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import animaizinhos.android.com.animaizinhos.R;

public class SonsAnimais extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView leao;
    private ImageView gato;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer sons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sons_animais);

        cao = (ImageView) findViewById(R.id.imgCaoID);
        leao = (ImageView) findViewById(R.id.imgLeaoID);
        gato = (ImageView) findViewById(R.id.imgGatoID);
        macaco = (ImageView) findViewById(R.id.imgMacacoID);
        ovelha = (ImageView) findViewById(R.id.imgOvelhaID);
        vaca = (ImageView) findViewById(R.id.imgVacaID);

        cao.setOnClickListener(this);
        leao.setOnClickListener(this);
        gato.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imgCaoID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.cao );
                tocarSom();
                Toast.makeText(SonsAnimais.this, "Som do Cachorro", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imgLeaoID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.leao );
                Toast.makeText(SonsAnimais.this, "Som do Leão", Toast.LENGTH_SHORT).show();
                tocarSom();
                break;

            case R.id.imgGatoID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.gato );
                Toast.makeText(SonsAnimais.this, "Som do Gato", Toast.LENGTH_SHORT).show();
                tocarSom();
                break;

            case R.id.imgMacacoID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.macaco );
                Toast.makeText(SonsAnimais.this, "Som do Macaco", Toast.LENGTH_SHORT).show();
                tocarSom();
                break;

            case R.id.imgOvelhaID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.ovelha );
                Toast.makeText(SonsAnimais.this, "Som da Ovelha", Toast.LENGTH_SHORT).show();
                tocarSom();
                break;

            case R.id.imgVacaID:
                sons = MediaPlayer.create(SonsAnimais.this, R.raw.vaca);
                Toast.makeText(SonsAnimais.this, "Som da Vaca", Toast.LENGTH_SHORT).show();
                tocarSom();
                break;


        }

    }

    public void tocarSom(){
        if(sons != null){
            sons.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (sons != null){
            sons.release();
            sons = null;
        }
       super.onDestroy();
    }
}
