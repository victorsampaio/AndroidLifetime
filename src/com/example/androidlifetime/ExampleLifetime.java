package com.example.androidlifetime;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ExampleLifetime extends Activity {

	protected static final String CATEGORIA = "lifetime";
	
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_example_lifetime);
        
      Log.i(CATEGORIA, getClassName() + ".onCreate() executed: " + icicle);
      
      //TextView t = new TextView(this);
      //t.setText("Example Lifetime. Verirfy LogCat.");
      //setContentView(t);
      TextView text;
      text = (TextView)findViewById(R.id.textViewInfo);
       text.setText("Example Lifetime. Verirfy LogCat.");        
    }
    
    protected void onStart(){
    	super.onStart();
    	Log.i(CATEGORIA, getClassName() + ".onStart() executed.");
    	
    }
    
    protected void onRestart(){
    	super.onRestart();
    	Log.i(CATEGORIA, getClassName() + ".onRestart() executed.");
    }

    protected void onResume(){
    	super.onResume();
    	Log.i(CATEGORIA, getClassName() + ".on Resume() executed.");
    }
    
    protected void onPause(){
    	super.onPause();
    	Log.i(CATEGORIA, getClassName() + ".onPause executed.");
    }
    
    protected void onStop(){
    	super.onStop();
    	Log.i(CATEGORIA, getClassName() + ".onStop() executed.");
    }
    
    protected void onDestroy(){
    	super.onDestroy();
    	Log.i(CATEGORIA, getClassName() + ".onDestroy() executed.");
    }
    

    private String getClassName() {
		String name = getClass().getName();
		return name.substring(name.lastIndexOf("."));
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.example_lifetime, menu);
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
