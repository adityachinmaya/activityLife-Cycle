package com.example.lifecyclemidterm;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;


public class TracerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Create executed");
	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("Tracer", "On Resume executed");
	}
	@Override
	protected void onPause() {
		super.onPause();
		Log.i("Tracer", "On Pause executed");
	}
	@Override
	protected void onStop() {
		super.onStop();
		Log.i("Tracer", "On stop executed");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("Tracer", "On Destroy executed");
	}
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i("Tracer", "On Restore Instance Instance State executed");
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i( "Tracer", "On Save instance state executed");
	}
}


