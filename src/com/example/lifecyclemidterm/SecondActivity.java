package com.example.lifecyclemidterm;


import android.R;
import android.R.layout;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;


public class SecondActivity extends TracerActivity{

	public String activity_second = "success";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}	
}
