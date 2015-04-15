package com.javacodegeeks.android.androidserviceexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    Intent serviceIntent = new Intent(this,MyService.class);
    public EditText editText = (EditText) findViewById(R.id.editTextPort);


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	// Start the  service
	public void startNewService(View view) {
		serviceIntent.putExtra("Port", Integer.parseInt(editText.getText().toString()));
		startService(serviceIntent);
	}

	// Stop the  service
	public void stopNewService(View view) {
		
		stopService(serviceIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
