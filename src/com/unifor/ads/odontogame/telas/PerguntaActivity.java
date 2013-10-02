package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class PerguntaActivity extends FragmentActivity  {
	
	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "DetectorGestos";
	MontarPerguntasPagerAdapte adapte;
    ViewPager mViewPager;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pergunta_tela);
		
		adicionarAcaoBotao();
		
		adapte = new MontarPerguntasPagerAdapte(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pagina);
        mViewPager.setAdapter(adapte);

		
		Log.i(TAG_LOG, "onCreate");
	}

	private void adicionarAcaoBotao() {
		// TODO Auto-generated method stub
		
	}
	
}
