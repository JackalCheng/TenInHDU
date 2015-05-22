package com.example.hduapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LActivity extends Activity{
	
//		private Button bt11;
		private Button bt12;
//		private Button bt21;
		private Button bt22;
//		private Button bt31;
		private Button bt32;
//		private Button bt41;
		private Button bt42;
//		private Button bt51;
		private Button bt52;
//		private Button bt61;
		private Button bt62;
//		private Button bt71;
		private Button bt72;
//		private Button bt81;
		private Button bt82;
//		private Button bt91;
		private Button bt92;
//		private Button bt101;
		private Button bt102;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.listview);
		
//			bt11=(Button) findViewById(R.id.buttoncx);
			bt12=(Button) findViewById(R.id.buttoncp);
//			bt21=(Button) findViewById(R.id.buttonjx);
			bt22=(Button) findViewById(R.id.buttonjp);
//			bt31=(Button) findViewById(R.id.buttonyx);
			bt32=(Button) findViewById(R.id.buttonyp);
//			bt41=(Button) findViewById(R.id.buttonsx);
			bt42=(Button) findViewById(R.id.buttonsp);
//			bt51=(Button) findViewById(R.id.buttonlx);
    		bt52=(Button) findViewById(R.id.buttonlp);
//			bt61=(Button) findViewById(R.id.buttonyix);
			bt62=(Button) findViewById(R.id.buttonyip);
//			bt71=(Button) findViewById(R.id.buttoncox);
			bt72=(Button) findViewById(R.id.buttoncop);
//			bt81=(Button) findViewById(R.id.buttonsax);
			bt82=(Button) findViewById(R.id.buttonsap);
//			bt91=(Button) findViewById(R.id.buttontx);
			bt92=(Button) findViewById(R.id.buttontp);
//			bt101=(Button) findViewById(R.id.buttonmx);
			bt102=(Button) findViewById(R.id.buttonmp);
			
			bt12.setOnClickListener(new OnClickListener() 
			{
				@Override
			    public void onClick(View v) 
			    {
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt22.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt32.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			bt42.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt52.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt62.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt72.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt82.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt92.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});
			
			bt102.setOnClickListener(new OnClickListener() 
			{
				
				public void onClick(View v) {
					setContentView(R.layout.listview);
					Intent intent=new Intent(LActivity.this,PActivity.class);
					startActivity(intent);
				}
			});

}
}
