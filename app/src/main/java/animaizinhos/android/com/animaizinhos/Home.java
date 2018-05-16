package animaizinhos.android.com.animaizinhos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends Activity {

    private ImageView sonsAnimais;
    private  ImageView descricaoAnimais;
    private ImageView idadeAnimais;
    private ImageView nomeInglesAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sonsAnimais = (ImageView) findViewById(R.id.img1Id);

        sonsAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, TelaAnimais.class));
            }
        });

    }
}
