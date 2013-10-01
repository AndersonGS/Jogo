package com.unifor.ads.odontogame.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Esta � uma Classe com o nome ImportarBanco, criada dia 27/09/2013 as
 * 20:07:27, no projeto DentinhoFeliz e dentro do pacote com.ags.dentinhofeliz.
 * Usando a ver��o da JRE 1.7.0_21 e a API 18 no android 4.3. O objetivo dessa
 * classe � fazer parte do trabalho mas especifico de importa��o do bando de
 * dados.
 * 
 * @author Anderson Graciano S.
 * @version 1.0.
 */
public abstract class ImportarBanco extends SQLiteOpenHelper {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata � determina um titulo para o Log informativo desta
	 * classe.
	 */
	public static final String TAG_LOG = "ImportarBanco";

	/**
	 * A variavel context do tipo Context foi declarada. O objetivo dessa
	 * variavel abstrata � guardar o contexto da Activit que esta usando o
	 * banco.
	 */
	protected Context context;

	/**
	 * Este � o construtor da classe Importar banco. Recebe os parametros
	 * necessario para montar o banco.
	 * 
	 * @param context
	 *            - O parametro context � do tipo Context. O contexto da
	 *            aplica��o que esta usando o banco.
	 * @param nome
	 *            - O parametro nome � do tipo String. O nome do banco.
	 * @param versao
	 *            - O parametro versao � do tipo int. A ver��o atual do banco.
	 */
	public ImportarBanco(Context context, String nome, int versao) {
		super(context, nome, null, versao);
		this.context = context;
		Log.i(TAG_LOG, "ImportarBanco");
	}

	public abstract void onCreate(SQLiteDatabase bd);

	public abstract void onUpgrade(SQLiteDatabase bd, int versaoAtual,
			int versaoNova);

	/**
	 * O metodo byFile da classe ImportarBanco, � uma metodo void que tem o
	 * objetivo de trazer o arquivo e executar o comando do SQLite para criar o
	 * banco.
	 * 
	 * @param fileID
	 *            - O parametro file id � do tipo int.
	 * @param bd
	 *            - O parametro bd � do tipo SQ lite database.
	 * @throws IOException
	 *             Sinal que uma I/O exception pode ocorrer.
	 */
	protected void byFile(int fileID, SQLiteDatabase bd) throws IOException {
		StringBuilder sql = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(context
				.getResources().openRawResource(fileID)));
		String line;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.length() > 0) {
				sql.append(line);
				if (line.endsWith(";")) {
					bd.execSQL(sql.toString());
					sql.delete(0, sql.length());
				}
			}
		}
		Log.i(TAG_LOG, "byFile");
	}
}