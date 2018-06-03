package animaizinhos.android.com.animaizinhos.Model.Entity;

import android.app.Activity;
import android.widget.ImageView;

/**
 * Created by Rafael Aquino on 14/05/2018.
 */

public class Animais extends Activity {

    private String nomeAnimal;
    private String habitate;
    private String viveMedia;
    private String nomeCientifico;
    private String alimetoCome;
    private String tipo;

    public Animais(){

    }

    public Animais(String nomeAnimal,String habitate, String viveMedia, String nomeCientifico, String alimetoCome, String tipo) {
        this.nomeAnimal = nomeAnimal;
        this.habitate = habitate;
        this.viveMedia = viveMedia;
        this.nomeCientifico = nomeCientifico;
        this.alimetoCome = alimetoCome;
        this.tipo = tipo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomemAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getHabitate() {
        return habitate;
    }

    public void setHabitate(String habitate) {
        this.habitate = habitate;
    }

    public String getViveMedia() {
        return viveMedia;
    }

    public void setViveMedia(String viveMedia) {
        this.viveMedia = viveMedia;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getAlimetoCome() {
        return alimetoCome;
    }

    public void setAlimetoCome(String alimetoCome) {
        this.alimetoCome = alimetoCome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
