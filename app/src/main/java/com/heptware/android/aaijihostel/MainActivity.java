package com.heptware.android.aaijihostel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.heptware.android.aaijihostel.data.fakeData;

import java.util.ArrayList;

import static com.heptware.android.aaijihostel.data.fakeData.getFakeData;

public class MainActivity extends AppCompatActivity {


    private String recievedString;
    // used for geting string sent from branchView activity.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        // get intent sent from branchView avtivity
        // and fetch string from it for listing pourpose.
        recievedString = intent.getStringExtra("students");

        StudentAdapterSetter();
        // same class method called for initializing adapter


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         //       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          //              .setAction("Action", null).show();

                Intent intent1 = new Intent(MainActivity.this ,StudentEdit.class);
                startActivity(intent1);
            }
        });
    }

    private void StudentAdapterSetter(){
        ArrayList<fakeData> studentData = getFakeData();
        // get data from fake data class

        StudentAdapter adapter = new StudentAdapter(this , studentData);
        // initializing adapter by constructer by passing list of students

        ListView listView = (ListView) findViewById(R.id.main_student_list_view);
        // get id of holding Students list's view (listView).

        listView.setAdapter(adapter);
        // finally setted adapter to listview.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
