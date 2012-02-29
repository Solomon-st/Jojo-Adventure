package com.sol.jojo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    protected void onDestroy() {
        // TODO save level information for kontinue
        super.onDestroy();
    }
    
    public void gameStart(View v) {
        // TODO start Level01
    }
    
    public void kontinue(View v) {
        // TODO start last out level
    }
    
    public void settings(View v) {
        
    }
    
    public void about(View v) {
        
    }
}