package com.example.flipflopstudios.contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class AddContacts extends Activity {

    NewColor newColor = new NewColor();

    public final static String EXTRA_MESSAGE = "com.example.flipflopstudios.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts);

        final Intent intent = new Intent(this,ContactList.class);

        int color = newColor.makeColors();


        final RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.addLayout);

        layout1.setBackgroundColor(color);

        Button newButton = (Button)findViewById(R.id.button);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);

                Intent intent = new Intent(AddContacts.this, ContactList.class);

                EditText editText = (EditText) findViewById(R.id.contactName);
                String message = editText.getText().toString();

                EditText email = (EditText) findViewById(R.id.contactEmail);
                String emailMessage = email.getText().toString();

                String combinedText = "My name is " + message + " and my email is " + emailMessage;

                intent.putExtra(EXTRA_MESSAGE, combinedText);
                startActivity(intent);


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
