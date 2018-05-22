package animaizinhos.android.com.animaizinhos.ViewModel.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import animaizinhos.android.com.animaizinhos.Model.Entity.Animais;
import animaizinhos.android.com.animaizinhos.R;

/**
 * Created by Samsung on 19/05/2018.
 */

public class MeuAdapter extends RecyclerView.Adapter {

    private List<Animais> animais;
    private Context context;

    public MeuAdapter(List<Animais> animais,Context context){
        this.animais = animais;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.list_animais, parent, false);
        
        MeuViewHolder holder = new MeuViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,int position) {

        MeuViewHolder holder = (MeuViewHolder) viewHolder;

        Animais animais = this.animais.get(position);

        holder.habitate.setText(animais.getHabitate());
        holder.viveMedia.setText(animais.getViveMedia());
        holder.nomeCientifico.setText(animais.getNomeCientifico());
        holder.alimetoCome.setText(animais.getAlimetoCome());
        holder.tipo.setText(animais.getTipo());
    }

    @Override
    public int getItemCount() {
        return animais.size();
    }
}
