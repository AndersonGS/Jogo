package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CadastroActivity extends Activity {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "CadastroActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_tela);
		adicionarAcaoBotao();
		Log.i(TAG_LOG, "onCreate");
	}
	
	/**
	 * O metodo Adicionar acao botao da classe MenuActivity, é uma metodo void
	 * que tem o objetivo de agrupar todos os botões.
	 */
	private void adicionarAcaoBotao() {
		botaoLoguim();
		Log.i(TAG_LOG, "adicionarAcaoBotao");
	}

	private void botaoLoguim() {
		Button bLoguim = (Button) findViewById(R.id.cadastro_botao_loguim);
		bLoguim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(CadastroActivity.this, MenuActivity.class);
				startActivity(intent);
				Log.i(TAG_LOG, "onClickbotaoJogar");
				finish();
			}
		});
		Log.i(TAG_LOG, "botaoLoguim");
	}
}
