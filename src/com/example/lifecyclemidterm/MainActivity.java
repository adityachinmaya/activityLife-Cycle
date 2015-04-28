package com.example.lifecyclemidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.R;
import android.R.layout;

public class MainActivity extends TracerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
	}

	public void onClick(View view) {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}

}
