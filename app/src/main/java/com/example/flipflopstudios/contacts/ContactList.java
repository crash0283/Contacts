package com.example.flipflopstudios.contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ContactList extends Activity {

    NewColor newColor = new NewColor();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        int bgColor = newColor.makeColors();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.listLayout);

        relativeLayout.setBackgroundColor(bgColor);

        Intent intent = getIntent();
        String message = intent.getStringExtra(AddContacts.EXTRA_MESSAGE);


        TextView textView = new TextView(this);
        textView.setTextSize(18);
        textView.setText(message);

        setContentView(textView);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.contact_list, menu);
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
