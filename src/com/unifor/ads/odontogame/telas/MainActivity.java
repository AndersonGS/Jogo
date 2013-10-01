package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;
import com.unifor.ads.odontogame.R.layout;
import com.unifor.ads.odontogame.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
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
