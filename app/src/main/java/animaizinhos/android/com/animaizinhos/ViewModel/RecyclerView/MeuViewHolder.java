package animaizinhos.android.com.animaizinhos.ViewModel.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import animaizinhos.android.com.animaizinhos.R;

/**
 * Created by Samsung on 19/05/2018.
 */

public class MeuViewHolder extends RecyclerView.ViewHolder {

    final TextView nomeAnimal;
    final TextView habitate;
    final TextView viveMedia;
    final TextView nomeCientifico;
    final TextView alimetoCome;
    final TextView tipo;

    public MeuViewHolder(View view){
        super(view);

        nomeAnimal = (TextView) view.findViewById(R.id.nomeAnimalTxt);
        habitate = (TextView) view.findViewById(R.id.habitateTxt);
        viveMedia = (TextView) view.findViewById(R.id.viveMediaTxt);
        nomeCientifico = (TextView) view.findViewById(R.id.nomeCientTxt);
        alimetoCome = (TextView) view.findViewById(R.id.alimenComTxt);
        tipo = (TextView) view.findViewById(R.id.tipoTxt);
    }
}
