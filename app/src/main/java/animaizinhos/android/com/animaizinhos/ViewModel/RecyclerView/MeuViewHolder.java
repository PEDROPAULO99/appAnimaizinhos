package animaizinhos.android.com.animaizinhos.ViewModel.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import animaizinhos.android.com.animaizinhos.R;

/**
 * Created by Samsung on 19/05/2018.
 */

public class MeuViewHolder extends RecyclerView.ViewHolder {


    final TextView habitate;
    final TextView viveMedia;
    final TextView nomeCientifico;
    final TextView alimetoCome;
    final TextView tipo;

    public MeuViewHolder(View view){
        super(view);
        habitate = (TextView) view.findViewById(R.id.activity_descricao_animais);
        viveMedia = (TextView) view.findViewById(R.id.activity_descricao_animais);
        nomeCientifico = (TextView) view.findViewById(R.id.activity_descricao_animais);
        alimetoCome = (TextView) view.findViewById(R.id.activity_descricao_animais);
        tipo = (TextView) view.findViewById(R.id.activity_descricao_animais);
    }
}
