package animaizinhos.android.com.animaizinhos.ViewModel.Activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.lang.reflect.Array;

import animaizinhos.android.com.animaizinhos.R;

public class NomeInglesAnimais extends AppCompatActivity implements View.OnClickListener {

    private TextView nomeAnimal;
    private ViewFlipper viewFlipper;
    private Button next;
    private String[] nomesTraducao =  {"Cachorro / Dog","Macaco / Monkey","Vaca / Cow","Ovelha / Sheep","Leão / Lion"," Gato / Cat"};
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome_ingles_animais);

        nomeAnimal = (TextView) findViewById(R.id.textoNomeIglesAnimal);

        nomeAnimal.setText(nomesTraducao[i]);

        i = 1;


        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.botaoProxId);
        next.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if (v == next && i <= 6) {
            viewFlipper.showNext();
            nomeAnimal.setText(nomesTraducao[i++]);
        }

        if (i == 6){
            i = 0;
        }


    }
}
