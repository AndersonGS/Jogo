package com.unifor.ads.odontogame.telas;

import com.unifor.ads.odontogame.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CasoFragment extends Fragment {
	public static final String ARG_OBJECT = "object";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.caso_inflater,
				container, false);
		return rootView;
	}
	
	

}
