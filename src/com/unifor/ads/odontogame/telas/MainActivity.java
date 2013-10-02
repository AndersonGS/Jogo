package com.unifor.ads.odontogame.telas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.unifor.ads.odontogame.R;

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
