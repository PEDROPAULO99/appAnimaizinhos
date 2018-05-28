package animaizinhos.android.com.animaizinhos.ViewModel.Activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import animaizinhos.android.com.animaizinhos.R;

public class NomeInglesAnimais extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper viewFlipper;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nome_ingles_animais);
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.botaoProxId);
        next.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == next) {
            viewFlipper.showNext();
        }
        else {viewFlipper.showNext();
        }


    }
}
