package animaizinhos.android.com.animaizinhos.ViewModel.Activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

import animaizinhos.android.com.animaizinhos.Model.Entity.Animais;
import animaizinhos.android.com.animaizinhos.Model.Entity.Cao;
import animaizinhos.android.com.animaizinhos.Model.Entity.Gato;
import animaizinhos.android.com.animaizinhos.Model.Entity.Leao;
import animaizinhos.android.com.animaizinhos.Model.Entity.Macaco;
import animaizinhos.android.com.animaizinhos.Model.Entity.Ovelha;
import animaizinhos.android.com.animaizinhos.Model.Entity.Vaca;
import animaizinhos.android.com.animaizinhos.ViewModel.RecyclerView.MeuAdapter;
import animaizinhos.android.com.animaizinhos.R;

public class DescricaoAnimais extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_animais);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        List<Animais> animais = new ArrayList<>();
        animais.add(new Cao("Cachorro","Animal doméstico vive em casas","vive em media 15 anos","kayque","Come ração","Mamifero"));
        animais.add(new Gato("Gato", "Animal doméstico vive em casas","vive em media 10 anos","kteeste","Come ração","Mamifero"));
        animais.add(new Leao("Leão", "Animal Selvagem, vive na floresta","vive em media 30 anos","kteeste","Come carne","Carnivoro"));
        animais.add(new Macaco("Macaco", "Animal Silvestre, vive na floresta","vive em media 15 anos","kteeste","Come frutas","Mamifero"));
        animais.add(new Ovelha("Ovelha", "Animal Silvestre, vive nos pastos","vive em media 17 anos","kteeste","Come pasto","Mamifero"));
        animais.add(new Vaca("Vaca", "Animal Silvestre, vive nos pastos","vive em media 19 anos","kteeste","Come pasto","Mamifero"));

        recyclerView.setAdapter(new MeuAdapter(animais,this));

        LinearLayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);


    }


}
