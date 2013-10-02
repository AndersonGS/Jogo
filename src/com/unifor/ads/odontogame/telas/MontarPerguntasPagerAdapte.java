package com.unifor.ads.odontogame.telas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Esta é uma Class com nome MontarPerguntasPagerAdapte, criada
 * dia 02/10/2013 as 14:45:59, no projeto Jogo e dentro do pacote
 * com.unifor.ads.odontogame.telas. Usando a verção da JRE 1.7.0_21 e a API 18
 * no android 4.2. O objetivo dessa classe é gerenciar a tela de swipe.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class MontarPerguntasPagerAdapte extends FragmentStatePagerAdapter {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "MontarPerguntasPagerAdapte";

	public MontarPerguntasPagerAdapte(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = null;
		Bundle args;
		switch (i) {
		case 0:
			fragment = new IntroPerguntaFragmento();
			args = new Bundle();
			args.putInt(IntroPerguntaFragmento.ARG_OBJECT, i + 1);
			fragment.setArguments(args);
			break;
		case 1:
			fragment = new CasoFragment();
			args = new Bundle();
			args.putInt(CasoFragment.ARG_OBJECT, i + 1);
			fragment.setArguments(args);
			break;
		case 2:
			fragment = new OpcaoFragmento();
			args = new Bundle();
			args.putInt(OpcaoFragmento.ARG_OBJECT, i + 1);
			fragment.setArguments(args);
			break;
		default:

			break;
		}
		Log.i(TAG_LOG, "getItem:" + i);
		return fragment;
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return "OBJECT " + (position + 1);
	}

}
