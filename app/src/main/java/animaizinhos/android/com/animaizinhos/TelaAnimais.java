package animaizinhos.android.com.animaizinhos;

import android.animation.IntArrayEvaluator;
import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaAnimais extends Activity implements View.OnClickListener {

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
        setContentView(R.layout.activity_tela_animais);

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
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.cao );
                tocarSom();
                break;

            case R.id.imgLeaoID:
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.leao );
                tocarSom();
                break;

            case R.id.imgGatoID:
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.gato );
                tocarSom();
                break;

            case R.id.imgMacacoID:
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.macaco );
                tocarSom();
                break;

            case R.id.imgOvelhaID:
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.ovelha );
                tocarSom();
                break;

            case R.id.imgVacaID:
                sons = MediaPlayer.create(TelaAnimais.this, R.raw.vaca);
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
