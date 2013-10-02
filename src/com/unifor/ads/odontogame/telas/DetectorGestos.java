package com.unifor.ads.odontogame.telas;

import android.util.Log;
import android.view.MotionEvent;
import android.view.GestureDetector.SimpleOnGestureListener;

/**
 * Esta щ uma Class com nome DetectorGestos, criada dia 02/10/2013 as 10:36:10,
 * no projeto Jogo e dentro do pacote com.unifor.ads.odontogame.telas. Usando a
 * verчуo da JRE 1.7.0_21 e a API 18 no android 4.2. O objetivo dessa classe щ
 * detectar os movimentos de swipe para trocar de tela.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class DetectorGestos extends SimpleOnGestureListener {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata щ determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "DetectorGestos";

	/**
	 * A variavel swipe min distancia do tipo Float foi declarada. O objetivo
	 * dessa variavel щ determinar a distancia do movimento em pixel.
	 */
	private float swipeMinDistancia = 100;

	/**
	 * A variavel swipe velocidade do tipo Float foi declarada. O objetivo dessa
	 * variavel щ determinar a velocidade do movimento em pixel por segundo.
	 */
	private float swipeVelocidade = 200;

	/**
	 * A variavel index telas do tipo Int foi declarada. O objetivo dessa
	 * variavel щ determina o indisse da tela que aparesse.
	 */
	private int indexTelas = 1;

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		boolean tratar = false;
		if (((e1.getX() - e2.getX()) > swipeMinDistancia)
				&& (Math.abs(velocityX) > swipeVelocidade)) {
			if (getIndexTelas() != 3) {
				indexTelas = indexTelas + 1;
			}
			tratar = true;
			Log.i(TAG_LOG, "onFling = Esquerda");
		} else if (((e2.getX() - e1.getX()) > swipeMinDistancia)
				&& (Math.abs(velocityX) > swipeVelocidade)) {
			if (getIndexTelas() != 1) {
				indexTelas = indexTelas - 1;
			}
			tratar = true;
			Log.i(TAG_LOG, "onFling = Direita");
		}
		return tratar;
	}

	/**
	 * O metodo getIndexTelas da classe DetectorGestos щ para obteer a variavel
	 * indexTelas do tipo Int. O objetivo desse metodo щ retorna o indice da
	 * tela.
	 * 
	 * @return indexTelas - A variavel indexTelas щ do tipo Int.
	 */
	public int getIndexTelas() {
		return indexTelas;
	}

}
