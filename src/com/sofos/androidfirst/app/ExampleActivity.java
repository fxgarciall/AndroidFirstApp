package com.sofos.androidfirst.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ExampleActivity extends Activity {

/*	
	ACTIVIDAD POR DEFECTO DEL PROYECTO, NO ES LA ACTIVIDAD PRINCIPAL
	
	      LA ACTIVIDAD PRINCIPAL ES TestSampleActivity.java
	
	*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example, menu);
		return true;
	}

}
