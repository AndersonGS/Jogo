package com.unifor.ads.odontogame.telas;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.unifor.ads.odontogame.R;

/**
 * Esta щ uma Class com nome PerguntaActivity, criada dia 02/10/2013 as
 * 14:47:12, no projeto Jogo e dentro do pacote com.unifor.ads.odontogame.telas.
 * Usando a verчуo da JRE 1.7.0_21. O objetivo dessa classe щ motar uma tela
 * swipe para mostrar todos os dados da pergunta.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class PerguntaActivity extends FragmentActivity {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata щ determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "DetectorGestos";

	/**
	 * A variavel adapte do tipo MontarPerguntasPagerAdapte foi declarada. O
	 * objetivo dessa variavel щ gerar uma adapte.
	 */
	MontarPerguntasPagerAdapte adapte;

	/**
	 * Fields-Default. A variavel m view pager do tipo ViewPager foi declarada.
	 * O objetivo dessa variavel щ gerar uma ViewPager.
	 */
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

	/**
	 * O metodo Adicionar acao botao da classe PerguntaActivity, щ uma metodo
	 * void que tem o objetivo de gerenciar os botoes.
	 */
	private void adicionarAcaoBotao() {
		// TODO Auto-generated method stub

	}

}
