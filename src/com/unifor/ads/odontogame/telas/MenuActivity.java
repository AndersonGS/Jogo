package com.unifor.ads.odontogame.telas;

import java.util.ArrayList;

import com.unifor.ads.odontogame.R;
import com.unifor.ads.odontogame.controle.GerenciarApp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

	private static final String TAG_LOG = "MenuActivity";
	private GerenciarApp gApp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_main);
		adicionarAcaoBotao();
		//gApp = new GerenciarApp(MenuActivity.this);
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

		int action = MotionEventCompat.getActionMasked(event);

		switch (action) {
		case (MotionEvent.ACTION_DOWN):
			Log.d(TAG_LOG, "Action was DOWN");
			return true;
		case (MotionEvent.ACTION_MOVE):
			Log.d(TAG_LOG, "Action was MOVE");
			return true;
		case (MotionEvent.ACTION_UP):
			Log.d(TAG_LOG, "Action was UP");
			return true;
		case (MotionEvent.ACTION_CANCEL):
			Log.d(TAG_LOG, "Action was CANCEL");
			return true;
		case (MotionEvent.ACTION_OUTSIDE):
			Log.d(TAG_LOG, "Movement occurred outside bounds "
					+ "of current screen element");
			return true;
		default:
			return super.onTouchEvent(event);
		}
	}

}
