package com.example.ahadiapps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
   public void InscripLaunch (View Page){
	   //Button Inscrip = (Button)findViewById(R.id.InscripBtnId);
	   Intent NextPage = new Intent (this,Inscription.class);
	   startActivity(NextPage);
	      
   }
}
