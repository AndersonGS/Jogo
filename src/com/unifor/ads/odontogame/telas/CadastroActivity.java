package com.unifor.ads.odontogame.telas;

import com.facebook.*;
import com.facebook.model.*;
import com.unifor.ads.odontogame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CadastroActivity extends Activity {

	/**
	 * A constante TAG_LOG do tipo String foi declarada. O objetivo dessa
	 * variavel abstrata é determina um titulo para o Log informativo desta
	 * classe.
	 */
	private static final String TAG_LOG = "CadastroActivity";

	private Button bFacebooc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_tela);
		adicionarAcaoBotao();
		
		butaoFacebook();
		

		Log.i(TAG_LOG, "onCreate");
	}

	private void butaoFacebook() {
		bFacebooc = (Button) findViewById(R.id.cadastro_botao_facebook);
		bFacebooc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				facebooK();
			}
		});
	}

	private void facebooK() {
		Session.openActiveSession(this, true, new Session.StatusCallback() {

		      // callback when session changes state
		      @Override
		      public void call(Session session, SessionState state, Exception exception) {
		        if (session.isOpened()) {

		          // make request to the /me API
		          Request.executeMeRequestAsync(session, new Request.GraphUserCallback() {

		            // callback after Graph API response with user object
		            @Override
		            public void onCompleted(GraphUser user, Response response) {
		              if (user != null) {
		          		Log.i(TAG_LOG, "Hello " + user.getName() + "!");
		              }
		            }
		          });
		        }
		      }
		    });
	}
   
	/**
	 * O metodo Adicionar acao botao da classe MenuActivity, é uma metodo void
	 * que tem o objetivo de agrupar todos os botões.
	 */
	private void adicionarAcaoBotao() {
		botaoLoguim();
		Log.i(TAG_LOG, "adicionarAcaoBotao");
	}

	private void botaoLoguim() {
		Button bLoguim = (Button) findViewById(R.id.cadastro_botao_loguim);
		bLoguim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(CadastroActivity.this, MenuActivity.class);
				startActivity(intent);
				Log.i(TAG_LOG, "onClickbotaoJogar");
				finish();
			}
		});
		Log.i(TAG_LOG, "botaoLoguim");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	  super.onActivityResult(requestCode, resultCode, data);
	  Session.getActiveSession().onActivityResult(this, requestCode, resultCode, data);
	}
	
}
