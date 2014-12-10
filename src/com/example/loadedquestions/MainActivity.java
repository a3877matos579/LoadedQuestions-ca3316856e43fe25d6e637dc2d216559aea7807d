package com.example.loadedquestions;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;






public class MainActivity extends Activity {
	
	int numPlayers;
	int numRounds;
	int state;
	int turn = 0;
	int rounds = 1;
	int guesser = 0;
	boolean[] isRead;
	String[] answers;
	int[] Score;
	int[] prvAns; 
	int rando;
	int i;
	int x = 0;
	int who;
	boolean redo = true;
	boolean allDone = false;
	Integer[] ranOrder; 
	
	//Create an array full of question
    final String[] myQuestions = {
    		"What is your morning routine like?",
    		"If you could travel anywhere, where would it be?",
    		"What is your favorite dessert?",
    		"What was the worst mood you were in today?",
    		"When is your ideal time to take a nap?",
    		"Is there anywhere else you'd rather be right now? If yes, then where?",
    		"Who do you regret meeting most in life?",
    		"What is your super power?",
    		"What is the most painful thing that ever happened to you, emotionally or physically?",
    		"What keeps you up at night?",
    		"If you could comit one crime and get away with it what would it be",
    		"Why are you the way you are?",
    		"Who has the Loswest Standareds in the room?",
    		"What is your biggest turn off?",
    		"Describe yourself in one word",
    		"What is you most prized item?",
    		"What is you favorite color?",
    		"What is two plus two?",
    		"How much sleep you did you not have during the hack-a-thon?"
    		
    };	
	
 
	
	protected static final String[][] String = null;
	Button mButton1;
	Button mButton2;
	Button mButton3;
	Button mButton4;
	Button mButton5;
	Button mButton6;
	Button mButton7;
	EditText mEditText1;
	EditText mEditText2;
	EditText mEditText3;
	EditText mEditText4;
	TextView mText;
	
	
	
	
	
	
	public void makeAllInvisible(){
		mText = (TextView)findViewById(R.id.textView1);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView2);
		mText.setVisibility(View.INVISIBLE);
		
		mEditText1 = (EditText)findViewById(R.id.editText1);
		mEditText1.setVisibility(View.INVISIBLE);
		
		mEditText2 = (EditText)findViewById(R.id.editText2);
		mEditText2.setVisibility(View.INVISIBLE);
		
		mEditText3 = (EditText)findViewById(R.id.editText3);
		mEditText3.setVisibility(View.INVISIBLE);
		
		mEditText4 = (EditText)findViewById(R.id.editText4);
		mEditText4.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView3);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView4);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView5);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView6);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView7);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView8);
		mText.setVisibility(View.INVISIBLE);
	
		mText = (TextView)findViewById(R.id.textView10);
		mText.setVisibility(View.INVISIBLE);
		
		mText = (TextView)findViewById(R.id.textView11);
		mText.setVisibility(View.INVISIBLE);
		
		mButton1 = (Button)findViewById(R.id.button1);
		mButton1.setVisibility(View.INVISIBLE);
		
		mButton2 = (Button)findViewById(R.id.button2);
		mButton2.setVisibility(View.INVISIBLE);
		
		mButton3 = (Button)findViewById(R.id.button3);
		mButton3.setVisibility(View.INVISIBLE);
		
		mButton4 = (Button)findViewById(R.id.button4);
		mButton4.setVisibility(View.INVISIBLE);
		
		mButton5 = (Button)findViewById(R.id.button5);
		mButton5.setVisibility(View.INVISIBLE);
		
		mButton6 = (Button)findViewById(R.id.button6);
		mButton6.setVisibility(View.INVISIBLE);
		
		mButton7 = (Button)findViewById(R.id.button7);
		mButton7.setVisibility(View.INVISIBLE);
		
		
		
	}
	
	public void makeFirstVisible(){
		
		state = 1;
		
		mText = (TextView)findViewById(R.id.textView1);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView2);
		mText.setVisibility(View.VISIBLE);
		
		mEditText1 = (EditText)findViewById(R.id.editText1);
		mEditText1.setVisibility(View.VISIBLE);
		
		mEditText2 = (EditText)findViewById(R.id.editText2);
		mEditText2.setVisibility(View.VISIBLE);
		
		mButton1 = (Button)findViewById(R.id.button1);
		mButton1.setVisibility(View.VISIBLE);
		
		mButton2 = (Button)findViewById(R.id.button2);
		mButton2.setVisibility(View.VISIBLE);
		
		mButton3 = (Button)findViewById(R.id.button3);
		mButton3.setVisibility(View.VISIBLE);
		
	}
	
	public void makeSecondVisible(){
		
		state = 2;
		
		mText = (TextView)findViewById(R.id.textView3);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView4);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView5);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView6);
		mText.setVisibility(View.VISIBLE);
		
		mEditText3 = (EditText)findViewById(R.id.editText3);
		mEditText3.setVisibility(View.VISIBLE);
		
		mButton4 = (Button)findViewById(R.id.button4);
		mButton4.setVisibility(View.VISIBLE);
		
		
		
	}
	
	public void makeThirdVisible(){
		
		mText = (TextView)findViewById(R.id.textView7);
		mText.setVisibility(View.VISIBLE);
		
		mText = (TextView)findViewById(R.id.textView8);
		mText.setVisibility(View.VISIBLE);
		
		mButton5 = (Button)findViewById(R.id.button5);
		mButton5.setVisibility(View.VISIBLE);
		

		mEditText4 = (EditText)findViewById(R.id.editText4);
		mEditText4.setVisibility(View.VISIBLE);
		
	}
	
	
public void makeFourthVisible(){
		
		mButton6 = (Button)findViewById(R.id.button6);
		mButton6.setVisibility(View.VISIBLE);
	
		mText = (TextView)findViewById(R.id.textView10);
		mText.setVisibility(View.VISIBLE);
		
	}
public void makeFifthVisible(){
	
	mText = (TextView)findViewById(R.id.textView11);
	mText.setVisibility(View.VISIBLE);
	
}
public void dum() {
	int randomness = (int) (Math.random() * 19);
	mText.setText(myQuestions[randomness]);
	}

	public boolean isUsed(int in){
	
	for(int x = 0; x < numPlayers; x++)
	{
		if(prvAns[x] == in)
			return true;
			
	}
		
	return false;
	}
	
	
	
	
	
	
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // Set OnClickListner to the login button 
        //make visible
      makeAllInvisible();
      makeFirstVisible();
      
      
      
      
        mButton1 = (Button)findViewById(R.id.button1);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        mButton4 = (Button)findViewById(R.id.button4);
        mButton5 = (Button)findViewById(R.id.button5);
        mButton6 = (Button)findViewById(R.id.button6);
       // mButton7 = (Button)findViewById(R.id.button7);
        
        
        mButton1.setOnClickListener(new View.OnClickListener() {
			
			
    			public void onClick(View v) {
    				
    				
            		
    				makeAllInvisible();
    			    makeSecondVisible();
    				//skips for guesser
    			    if(turn == guesser){
    			  
    			  
    			    	turn++;
    			    	mText = (TextView)findViewById(R.id.textView5); 
    	        		mText.setText("Player "+(turn + 1)+" ");
    			    }
    				
    				/*tent i = new Intent(getApplicationContext(), Activity2.class);
            		i.putExtra("player", mEditText1.getText().toString());*/
            		/*startActivity(new Intent(MainActivity.this, Activity2.class));*/
    				/*startActivity(onetotwo);*/				
    			}
    		});
        
        
        
        mButton2.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		
        		
        		//player names
        		
        	
        		
        		
        		
        		
        		
        		
        		mEditText1 = (EditText)findViewById(R.id.editText1);
        		
        		mText = (TextView)findViewById(R.id.textView5);
        		     		
        		numPlayers = Integer.parseInt(mEditText1.getText().toString());
        		
        		
        		mText.setText("Player "+(turn + 1)+" ");
        		
        		mText = (TextView)findViewById(R.id.textView1);
        		mText.setText("There are "+mEditText1.getText().toString()+" players!");
        		
        		answers = new String[numPlayers];
        		
        		Score = new int[numPlayers];
        		
        		for(int i = 0; i < numPlayers; i++)
        			Score[i] = 0;
        		
        		
        		isRead = new boolean[numPlayers];
        		for(int i = 0; i < numPlayers; i++){
        			isRead[i] = false;
        		}
        		prvAns = new int[numPlayers];
        		for(int i = 0; i < numPlayers; i++)
        		{
        			prvAns[i] = -1;
        				
        		}
        		ranOrder = new Integer[numPlayers - 1];
        		for(int i = 0 ;i < (numPlayers) ; i++)
        		{
        			if(i != guesser){
        			ranOrder[x] = i;
        			x++;}
        		}
        		Collections.shuffle(Arrays.asList(ranOrder));
      
        		
        		/*getPreferences(test);
        		onetotwo.putExtra("players", test);*/
        		
        	}
        });
        
        mButton3.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
       	
        		mEditText2 = (EditText)findViewById(R.id.editText2);
        		mText = (TextView)findViewById(R.id.textView6);
        		numRounds = Integer.parseInt(mEditText2.getText().toString());
        		
        		mText = (TextView)findViewById(R.id.textView2);
        		mText.setText("There will be "+numRounds+" rounds!");
        		
        		mText = (TextView)findViewById(R.id.textView6);
        		mText.setText("Round "+rounds+" ");

        		
        		
      
        	}
        });
        
        mButton4.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		
        		if(turn != guesser)
        		{
        		mEditText3 = (EditText)findViewById(R.id.editText3);
        		answers[turn] = mEditText3.getText().toString();
        		
        		turn++;
        		}
        		if(guesser == turn){
        			
        			turn++;
        			mText = (TextView)findViewById(R.id.textView5); 
        			mText.setText("Player "+(turn + 1)+" ");
        			}
        		mText = (TextView)findViewById(R.id.textView5); 
        		//goes from player 1 to player 2, etc.
        		mText.setText("Player "+(turn + 1)+" ");
        	
        		
        		mEditText3.setText("");
        		
        		/*if(guesser == turn){
        			turn++;
        			mText = (TextView)findViewById(R.id.textView5); 
        			mText.setText("Player "+(turn + 1)+" ");
        		}*/
        			
        		
        		
        		if(turn == numPlayers){
        			makeAllInvisible();
        			makeThirdVisible();
        			mEditText4.setText("");
        			mText = (TextView)findViewById(R.id.textView8);
        			i = 0;
        			
        			mText.setText(answers[ranOrder[i]]);
        			
        	
        			
        		}
        		
        		
        		
        	}
        });
        
    
        
    mButton5.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		
    		mEditText4 = (EditText)findViewById(R.id.editText4);
    		if(i != (numPlayers - 2)){
    		int temp =( Integer.parseInt(mEditText4.getText().toString()) - 1); 	
    		if(temp == ranOrder[i])
    			Score[guesser] = Score[guesser] + 1;
    		//Score[guesser] = Integer.parseInt(mEditText4.getText().toString());
      		i++;
    		mText = (TextView)findViewById(R.id.textView8);
    		mText.setText(answers[ranOrder[i]]);
    		
    		mEditText4.setText("");
    		}
    		else
    		{
    			mEditText4 = (EditText)findViewById(R.id.editText4);
    			int temp =( Integer.parseInt(mEditText4.getText().toString()) - 1); 	
        		if(temp == ranOrder[i])
        			Score[guesser] = Score[guesser] + 1;
    			makeAllInvisible();
    			makeFourthVisible();
    			
    			mText = (TextView)findViewById(R.id.textView10);
        		mText.setText("Player "+(guesser + 1)+" Score is : "+Score[guesser]+" ");
        		
        		
    		}
    	
    		
    		
    		
    		
    		/*if(rounds > numRounds){
    			makeAllInvisible();
    			makeFourthVisible();
    			
    			mButton7 = (Button)findViewById(R.id.button7);
    			mButton7.setVisibility(View.VISIBLE);
    			
    		}*/
    		
    		
  
    		
    		
    		
    	}
    });
	//Randomly generates one element out of the nine of the string each time button is pressed
	mText = (TextView)findViewById(R.id.textView3);
	
	
	
	int randomness = (int) (Math.random() * 19);
	mText.setText(myQuestions[randomness]);
	
	
	
	
	
	mButton6.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		if(guesser < numPlayers)
    		{
    			guesser = 0;
    			mText = (TextView)findViewById(R.id.textView6);
    			mText.setText("Round "+(rounds + 1)+" ");
        		rounds++;
        		
    		}
    		
    		
    		guesser++;
    		x = 0;
    		for(int i = 0 ;i < (numPlayers) ; i++)
    		{
    			if(i != guesser){
    			ranOrder[x] = i;
    			x++;}
    		}
    		Collections.shuffle(Arrays.asList(ranOrder));
    		
    		turn = 0;
    		makeAllInvisible();
    		makeSecondVisible();
    		
    		mText = (TextView)findViewById(R.id.textView5);
    		mText.setText("Player "+(turn + 1)+" ");
    		for(int i = 0; i <  numPlayers; i++ )
    		{
    			answers[i] = " ";
    		}
    		
    		
    		mText = (TextView)findViewById(R.id.textView3);
    		dum();
    		
    		
    		if(rounds - 1 == numRounds){
    			
    			
        		makeAllInvisible();
    			makeFifthVisible();
    			//if the player has the highest score
    			int max = -1;
    			
    			for(int p = 0; p < numPlayers; p++)
    			{
    				if(max < Score[p]){
    					max = Score[p];
    					who = p;}
    			}
    			
    			mText = (TextView)findViewById(R.id.textView11);
    			mText.setText("Player "+(who + 1)+" wins with a score of "+Score[who]);
    			}
        
    		         
    		
  
    		
    		
    		
    		
    		
    		
    		
    	
    		
    		
    		
    		
    		
    		
    		
  
    		
    		
    		
    	}
    });
	
	
   }
    
    



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
