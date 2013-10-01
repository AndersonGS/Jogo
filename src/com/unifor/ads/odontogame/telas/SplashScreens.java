package com.unifor.ads.odontogame.telas;

import java.util.Timer;
import java.util.TimerTask;
import com.unifor.ads.odontogame.R;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreens extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
	}

	@Override
	protected void onResume() {
		super.onResume();
        tempoLogo();
	}

	private void tempoLogo() {
		new Timer().schedule(new TimerTask() {
        	 
            @Override
            public void run() { 
                finish();
                Intent intent = new Intent();
                intent.setClass(SplashScreens.this, MenuActivity.class);
                startActivity(intent);
            }
        }, 4000);
	}
	
}
