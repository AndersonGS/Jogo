package com.unifor.ads.odontogame.telas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unifor.ads.odontogame.R;

public class OpcaoFragmento extends Fragment {
	public static final String ARG_OBJECT = "object";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.opcao_inflater,
				container, false);
		return rootView;
	}
	
	
}
