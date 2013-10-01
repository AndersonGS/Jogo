package com.unifor.ads.odontogame.modelo;

import com.unifor.ads.odontogame.R;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Esta é uma Class com nome VercaoBanco, criada dia 27/09/2013 as 20:36:19, no
 * projeto DentinhoFeliz e dentro do pacote com.ags.dentinhofeliz. Usando a
 * verção da JRE 1.7.0_21 e a API 18 no android 4.3. O objetivo dessa classe é
 * criar a primeira vez o banco e atualizar se a verção for alterada.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public class VercaoBanco extends ImportarBanco {

	/**
	 * A constante NAME do tipo String foi declarada. O objetivo dessa variavel
	 * abstrata é nomear o Banco SQLite que vai ficar armazenado no diretório
	 * /data/data/<nome-do-pacote-utilizado>/databases/nome-do-arquivo.sqlite.
	 */
	public static final String NAME = "dbBancoJogo";

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
	public static final String TAG_LOG = "VercaoBanco";

	/**
	 * A constante VERSAO do tipo Int foi declarada. O objetivo dessa variavel
	 * primitiva é determinar a verção do banco atual.
	 */
	public static final int VERSAO = 3;

	/**
	 * Este é o construtor da classe Vercao banco.
	 * 
	 * @param context
	 *            - O parametro context é do tipo Context. Determina o contexto
	 *            em que está sendo executado.
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
	 * O metodo Cria tabelas da classe VercaoBanco, é uma metodo void que tem o
	 * objetivo de criar o todo o banco, suas tabelas e inserir os pré dados.
	 * 
	 * @param bd
	 *            - O parametro bd é do tipo SQ lite database.
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
