package com.unifor.ads.odontogame.telas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unifor.ads.odontogame.R;

/**
 * Esta � uma Class com nome IntroPerguntaFragmento, criada dia
 * 02/10/2013 as 14:42:56, no projeto Jogo e dentro do pacote
 * com.unifor.ads.odontogame.telas. Usando a ver��o da JRE 1.7.0_21 e a API 18 no android 4.2. O objetivo dessa classe �
 * Inflar um fragmento de tala na forma de swipe.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class IntroPerguntaFragmento extends Fragment {

	/**
	 * A constante ARG_OBJECT do tipo String foi declarada. O objetivo dessa
	 * variavel � determinar o nome do fragmento.
	 */
	public static final String ARG_OBJECT = "object";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.intro_perdunta_inflater,
				container, false);
		return rootView;
	}

}
