package com.melayer.recreat;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState != null) {

			String myName = savedInstanceState.getString("KEY_SAVE_MY_NAME");
			Boolean checkState = savedInstanceState
					.getBoolean("KEY_STATE_CHECK");

		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {

		outState.putString("KEY_SAVE_MY_NAME", "android");
		outState.putBoolean("KEY_STATE_CHECK", true);

		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);

		String myName = savedInstanceState.getString("KEY_SAVE_MY_NAME");
		Boolean checkState = savedInstanceState.getBoolean("KEY_STATE_CHECK");
	}

}
