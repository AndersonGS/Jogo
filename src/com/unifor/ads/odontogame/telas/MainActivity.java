package com.unifor.ads.odontogame.telas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.unifor.ads.odontogame.R;

/**
 * Esta é uma Class com nome MainActivity, criada dia 02/10/2013
 * as 14:43:56, no projeto Jogo e dentro do pacote
 * com.unifor.ads.odontogame.telas. Usando a verção da JRE 1.7.0_21 e a API 18
 * no android 4.2. O objetivo dessa classe é iniciar o aplicativo
 * provisoriamente.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	@Override
	protected void onResume() {
		super.onResume();
		Intent intent = new Intent();
		intent.setClass(this, SplashScreens.class);
		startActivity(intent);
		finish();
	}

}
