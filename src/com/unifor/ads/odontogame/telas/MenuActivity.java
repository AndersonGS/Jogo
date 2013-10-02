package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;
import com.unifor.ads.odontogame.controle.GerenciarApp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

	private static final String TAG_LOG = "MenuActivity";

	private GerenciarApp gApp;
	private GestureDetector detector;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_main);
		adicionarAcaoBotao();

		// gApp = new GerenciarApp(MenuActivity.this);
		detector = new GestureDetector(this, new DetectorGestos());

		Log.i(TAG_LOG, "onCreate");
	}

	/**
	 * O metodo Adicionar acao botao da classe MenuActivity, é uma metodo void
	 * que tem o objetivo de agrupar todos os botões.
	 */
	private void adicionarAcaoBotao() {
		botaoJogar();
		Log.i(TAG_LOG, "adicionarAcaoBotao");
	}

	/**
	 * O metodo Botao jogar da classe MenuActivity, é uma metodo void que tem o
	 * objetivo de pegar a estancia do botão e adicionar um escutador que espera
	 * o usuario apertar o botão.
	 */
	private void botaoJogar() {
		Button bJogar = (Button) findViewById(R.id.menu_botao_jogar);
		bJogar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Log.i(TAG_LOG, "onClickbotaoJogar");
			}
		});
		Log.i(TAG_LOG, "botaoJogar");
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean tratouEvento = detector.onTouchEvent(event);	
		if(tratouEvento){
			return tratouEvento;
		}
		return super.onTouchEvent(event);

	}

}
