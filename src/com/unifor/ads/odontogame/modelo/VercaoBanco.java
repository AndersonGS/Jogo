package com.unifor.ads.odontogame.modelo;

import com.unifor.ads.odontogame.R;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Esta � uma Class com nome VercaoBanco, criada dia 27/09/2013 as 20:36:19, no
 * projeto DentinhoFeliz e dentro do pacote com.ags.dentinhofeliz. Usando a
 * ver��o da JRE 1.7.0_21 e a API 18 no android 4.3. O objetivo dessa classe �
 * criar a primeira vez o banco e atualizar se a ver��o for alterada.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class VercaoBanco extends ImportarBanco {

	/**
	 * A constante NAME do tipo String foi declarada. O objetivo dessa variavel
	 * abstrata � nomear o Banco SQLite que vai ficar armazenado no diret�rio
	 * /data/data/<nome-do-pacote-utilizado>/databases/nome-do-arquivo.sqlite.
	 */
	public static final String NAME = "dbBancoJogo";

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata � determina um titulo para o Log informativo desta
	 * classe.
	 */
	public static final String TAG_LOG = "VercaoBanco";

	/**
	 * A constante VERSAO do tipo Int foi declarada. O objetivo dessa variavel
	 * primitiva � determinar a ver��o do banco atual.
	 */
	public static final int VERSAO = 3;

	/**
	 * Este � o construtor da classe Vercao banco.
	 * 
	 * @param context
	 *            - O parametro context � do tipo Context. Determina o contexto
	 *            em que est� sendo executado.
	 */
	public VercaoBanco(Context context) {
		super(context, NAME, VERSAO);
		Log.i(TAG_LOG, "BancoUsuarios");
	}

	@Override
	public void onCreate(SQLiteDatabase bd) {
		criaTabelas(bd);
		Log.i(TAG_LOG, "onCreate");
	}

	@Override
	public void onUpgrade(SQLiteDatabase bd, int versaoAtual, int versaoNova) {
		Log.e(TAG_LOG, "V.atual: " + versaoAtual);
		Log.e(TAG_LOG, "Nova V.: " + versaoNova);
		try {
			// bd.execSQL("drop table usuarios_tbl;");
		} catch (Exception e) {
			Log.e(TAG_LOG, "onUpgrade", e);
		}
		criaTabelas(bd);
		Log.i(TAG_LOG, "onUpgrade");
	}

	/**
	 * O metodo Cria tabelas da classe VercaoBanco, � uma metodo void que tem o
	 * objetivo de criar o todo o banco, suas tabelas e inserir os pr� dados.
	 * 
	 * @param bd
	 *            - O parametro bd � do tipo SQ lite database.
	 */
	private void criaTabelas(SQLiteDatabase bd) {
		try {
			byFile(R.raw.create, bd);
		} catch (Exception e) {
			Log.e(TAG_LOG, "criaTabelas", e);
		}
		Log.i(TAG_LOG, "criaTabelas");
	}

}
