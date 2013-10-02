package com.unifor.ads.odontogame.telas.jogo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unifor.ads.odontogame.R;

/**
 * Esta é uma Class com nome OpcaoFragmento, criada dia
 * 02/10/2013 as 14:42:01, no projeto Jogo e dentro do pacote
 * com.unifor.ads.odontogame.telas. Usando a verção da JRE 1.7.0_21 e a API 18 no android 4.2. O objetivo dessa classe é
 * Inflar um fragmento de tala na forma de swipe.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class OpcaoFragmento extends Fragment {


	/**
	 * A constante ARG_OBJECT do tipo String foi declarada. O
	 * objetivo dessa variavel é determinar o nome do fragmento.
	 */
	public static final String ARG_OBJECT = "object";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.opcao_inflater, container,
				false);
		return rootView;
	}

}
