package com.example.flipflopstudios.contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class AddContacts extends Activity {

    NewColor newColor = new NewColor();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts);

        final Intent intent = new Intent(this,ContactList.class);

        int color = newColor.makeColors();


        final RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.addLayout);

        layout1.setBackgroundColor(color);

        EditText name = (EditText) findViewById(R.id.contactName);
        final Editable getName = name.getText();


        Button newButton = (Button)findViewById(R.id.button);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);
                Toast.makeText(AddContacts.this, getName,Toast.LENGTH_LONG).show();



            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_contacts, menu);
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
