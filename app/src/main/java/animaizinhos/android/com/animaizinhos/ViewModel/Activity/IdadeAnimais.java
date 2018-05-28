package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import animaizinhos.android.com.animaizinhos.R;

public class IdadeAnimais extends Activity {

    private ImageView cachorro;
    private ImageView gaato;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade_animais);


        cachorro = (ImageView) findViewById(R.id.cachorroId);
        gaato = (ImageView) findViewById(R.id.gaatoId);

        cachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdadeAnimais.this, IdadeCachorro.class));
            }
        });

        gaato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdadeAnimais.this, IdadeGato.class));
            }
        });


    }
}
