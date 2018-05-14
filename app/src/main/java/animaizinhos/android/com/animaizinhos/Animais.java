package animaizinhos.android.com.animaizinhos;

import android.app.Activity;

/**
 * Created by Rafael Aquino on 14/05/2018.
 */

public class Animais extends Activity {

    private String olhos;
    private String cor;
    private String ondeVive;

    public Animais(){

    }

    public Animais(String olhos, String cor, String ondeVive) {
        this.olhos = olhos;
        this.cor = cor;
        this.ondeVive = ondeVive;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOndeVive() {
        return ondeVive;
    }

    public void setOndeVive(String ondeVive) {
        this.ondeVive = ondeVive;
    }
}
