package animaizinhos.android.com.animaizinhos.ViewModel.Fragment;

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
import animaizinhos.android.com.animaizinhos.ViewModel.RecyclerView.MeuAdapter;
import animaizinhos.android.com.animaizinhos.R;

public class DescricaoAnimais extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_animais);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        List<Animais> animais = new ArrayList<>();
        animais.add(new Cao("latir","30","kayque","rafa","rafa moreira"));
        animais.add(new Cao("latir","30","kayque","rafa","rafa morera"));
        //animais.add(new Gato());
        //animais.add(new Macaco();
        //animais.add(new Leao());

        recyclerView.setAdapter(new MeuAdapter(animais,this));

        LinearLayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("DescricaoAnimais Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
