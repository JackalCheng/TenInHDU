package com.example.hduapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PActivity extends Activity{
	
	private Button bt00;
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pingfen);
	
		bt00=(Button) findViewById(R.id.buttonwcpf);
		
		bt00.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				Toast.makeText(getApplicationContext(), "¹§Ï²£¬ÆÀ·Ö³É¹¦£¡",Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(PActivity.this,LActivity.class);
				startActivity(intent);
				
			}
		});
	}
}
