package com.example.hduapp;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity{
	private Button bt1;
	private Button bt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		bt1=(Button) findViewById(R.id.button1);
		bt2=(Button) findViewById(R.id.button2);
		
		bt1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				Intent intent=new Intent(MainActivity.this,RActivity.class);
				startActivity(intent);
			}
		});
		
        bt2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				Intent intent=new Intent(MainActivity.this,LActivity.class);
				startActivity(intent);
			}
		});
		
	}
}