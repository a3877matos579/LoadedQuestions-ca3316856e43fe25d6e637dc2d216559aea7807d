package com.example.loadedquestions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends Activity {
	
	Button mButton1;
	Button mButton2;
	Button mButton3;
	EditText mEditText1;
	EditText mEditText2;
	TextView mText;
	
	/*int numPlayers = getIntent().getIntExtra("player",70);*/
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		 final Button button4 = (Button) findViewById(R.id.button4);
	        
	        button4.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View v) {
					/*mText = (TextView)findViewById(R.id.textView4);
	        		mText.setText("There are "+mEditText1.getText().toString()+" players!");*/
	        		
					startActivity(new Intent(Activity2.this, Activity3.class));
					
				}
			});
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
	
