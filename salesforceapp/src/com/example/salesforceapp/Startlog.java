package com.example.salesforceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Startlog extends Activity {
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.startlog);

		new Handler().postDelayed(new Thread() {
			@Override
			public void run() {
				Intent mainMenu = new Intent(Startlog.this, MainActivity.class);
				Startlog.this.startActivity(mainMenu);
				Startlog.this.finish();
				overridePendingTransition(R.layout.fadein, R.layout.fadeout);

			}
		}, 1000);
	}
}
