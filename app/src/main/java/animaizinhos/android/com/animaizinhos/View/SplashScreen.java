package animaizinhos.android.com.animaizinhos.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import animaizinhos.android.com.animaizinhos.R;
import animaizinhos.android.com.animaizinhos.ViewModel.Activity.Login;

public class SplashScreen extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(this, 3000);


    }

    public  void run(){
        startActivity(new Intent(this, Login.class));
        finish();
    }
}
