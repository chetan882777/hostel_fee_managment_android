package com.heptware.android.aaijihostel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StudentEdit extends AppCompatActivity {

    private Spinner mHostelSpinner;
    private Spinner mFeeSpinner;
    private Spinner mClassSpinner;
    private Spinner mAgeSpinner;
    private Spinner mLastResultSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_edit);

        mHostelSpinner = (Spinner) findViewById(R.id.spinner_hostel_branch);
        setUpSpinner(R.array.array_hostel_options , mHostelSpinner);

       mFeeSpinner = (Spinner) findViewById(R.id.spinner_fee_selector);
       setUpSpinner(R.array.array_fee_options , mFeeSpinner);

       mClassSpinner = (Spinner) findViewById(R.id.spinner_class);
       setUpSpinner(R.array.array_class_options , mClassSpinner);

       mAgeSpinner = (Spinner) findViewById(R.id.spinner_age);
       setUpSpinner(R.array.array_age_options , mAgeSpinner);

       mLastResultSpinner = (Spinner) findViewById(R.id.spinner_last_result);
       setUpSpinner(R.array.array_last_result_options , mLastResultSpinner);

    }

    private void setUpSpinner(int id , Spinner spinner) {
        // Create adapter for spinner. The list options are from the String array it will use
        // the spinner will use the default layout
        ArrayAdapter spinnerAdapter = ArrayAdapter.createFromResource(this,
                id, android.R.layout.simple_spinner_item);

        // Specify dropdown layout style - simple list view with 1 item per line
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);


        // Apply the adapter to the spinner
        spinner.setAdapter(spinnerAdapter);

        // Set the integer mSelected to the constant values
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = (String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals(getString(R.string.aaiji_a))) {
                      //  mGender = PetEntry.GENDER_MALE;
                    } else if (selection.equals(getString(R.string.aaiji_b))) {
                      //  mGender = PetEntry.GENDER_FEMALE;
                    } else if (selection.equals(getString(R.string.aaiji_c))) {
                        //  mGender = PetEntry.GENDER_FEMALE;
                    } else {
                       // mGender = PetEntry.GENDER_UNKNOWN;
                    }
                }
            }
            // Because AdapterView is an abstract class, onNothingSelected must be defined
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
               // mGender = PetEntry.GENDER_UNKNOWN;
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_student_edit , menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_save){
            return true;
        }else if(id == R.id.action_clear_all){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
