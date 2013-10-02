package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;
import com.unifor.ads.odontogame.controle.GerenciarApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
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
				Intent intent = new Intent();
				intent.setClass(MenuActivity.this, PerguntaActivity.class);
				startActivity(intent);
				Log.i(TAG_LOG, "onClickbotaoJogar");
			}
		});
		Log.i(TAG_LOG, "botaoJogar");
	}

}
