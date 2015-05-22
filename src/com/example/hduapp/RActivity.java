package com.example.hduapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class RActivity extends Activity
{
	   
	  private Button bt3;
	  
	       	@Override
	   protected void onCreate(Bundle savedInstanceState)
	       	{
	            super.onCreate(savedInstanceState);
	       		setContentView(R.layout.register);
	       		
	       		SharedPreferences pref = getSharedPreferences("Myuser", MODE_PRIVATE);
	       		final Editor editor = pref.edit();
	       		
	       		EditText node=(EditText) findViewById(R.id.editText1);
	       		String snode = node.getText().toString();
	       		editor.putString("ssnode", snode);
	       		EditText name=(EditText) findViewById(R.id.editText2);
	       		String sname = name.getText().toString();
	       		editor.putString("ssname", sname);
	       		EditText date=(EditText) findViewById(R.id.editText3);
	       		String sdate = date.getText().toString();
	       		editor.putString("ssdate", sdate);
	       		RadioGroup sex = (RadioGroup) findViewById(R.id.sex);
	       		sex.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						RadioButton r = (RadioButton) findViewById(checkedId);
						r.getText();
						editor.putString("ssex", (String) r.getText());
					}
				});
	       		EditText college=(EditText) findViewById(R.id.editText4);
	       		String scollege = college.getText().toString();
	       		editor.putString("sscollege", scollege);
	       		EditText classs=(EditText) findViewById(R.id.editText5);
	       		String sclasss = classs.getText().toString();
				editor.putString("ssclass", sclasss);
	       		
	       		
	       		bt3=(Button) findViewById(R.id.button3);
	       		
	       		bt3.setOnClickListener(new OnClickListener() 
	       		{
					
					@Override
					public void onClick(View v) 
					{
						editor.commit();
						Toast.makeText(getApplicationContext(), "¹§Ï²£¬×¢²á³É¹¦£¡",Toast.LENGTH_SHORT).show();
						Intent intent=new Intent(RActivity.this,MainActivity.class);
						startActivity(intent);
					}
				});
	       		
			}
	     
}

