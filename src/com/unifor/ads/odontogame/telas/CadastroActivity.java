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
		
		verificarSessionFacebook(savedInstanceState);

		Log.i(TAG_LOG, "onCreate");
	}

    private Session.StatusCallback statusCallback = new SessionStatusCallback();
    
	private void verificarSessionFacebook(Bundle savedInstanceState) {
		Settings.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);

        Session session = Session.getActiveSession();
        if (session == null) {
            if (savedInstanceState != null) {
                session = Session.restoreSession(this, null, statusCallback, savedInstanceState);
            }
            if (session == null) {
                session = new Session(this);
            }
            Session.setActiveSession(session);
            if (session.getState().equals(SessionState.CREATED_TOKEN_LOADED)) {
                session.openForRead(new Session.OpenRequest(this).setCallback(statusCallback));
            }
        }
        updateView();
	}
	
    private void updateView() {
        Session session = Session.getActiveSession();
        if (session.isOpened()) {
        	bFacebooc.setText("Facebook Logout");
        	bFacebooc.setOnClickListener(new OnClickListener() {
                public void onClick(View view) { onClickLogout(); }
            });
        } else {
        	bFacebooc.setText("Facebook Login");
            bFacebooc.setOnClickListener(new OnClickListener() {
                public void onClick(View view) { onClickLogin(); }
            });
        }
    }
    
    private void onClickLogin() {
        Session session = Session.getActiveSession();
        if (!session.isOpened() && !session.isClosed()) {
            session.openForRead(new Session.OpenRequest(this).setCallback(statusCallback));
        } else {
            Session.openActiveSession(this, true, statusCallback);
        }
    }

    private void onClickLogout() {
        Session session = Session.getActiveSession();
        if (!session.isClosed()) {
            session.closeAndClearTokenInformation();
        }
    }

	private void butaoFacebook() {
		bFacebooc = (Button) findViewById(R.id.cadastro_botao_facebook);
		Log.i(TAG_LOG, "adicionarAcaoBotao");
	}

   
	/**
	 * O metodo Adicionar acao botao da classe MenuActivity, é uma metodo void
	 * que tem o objetivo de agrupar todos os botões.
	 */
	private void adicionarAcaoBotao() {
		botaoLoguim();
		butaoFacebook();
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
	
    private class SessionStatusCallback implements Session.StatusCallback {
        @Override
        public void call(Session session, SessionState state, Exception exception) {
            updateView();
        }
    }
}
