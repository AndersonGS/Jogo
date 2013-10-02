package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;
import com.unifor.ads.odontogame.controle.GerenciarApp;
import com.unifor.ads.odontogame.telas.jogo.PerguntaActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Esta é uma Class com nome MenuActivity, criada dia 02/10/2013
 * as 14:44:47, no projeto Jogo e dentro do pacote
 * com.unifor.ads.odontogame.telas. Usando a verção da JRE 1.7.0_21 e a API 18
 * no android 4.2. O objetivo dessa classe é mostrar um meno para o usuario.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
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

		// gApp = new GerenciarApp(MenuActivity.this);

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
