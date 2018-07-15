package com.heptware.android.aaijihostel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BranchView extends AppCompatActivity {

    Button branchViewAllStudentButton;

    Button branchViewAaijiA_StudentButton;

    Button branchViewAaijiB_StudentButton;

    Button branchViewAaijiC_StudentButton;

    Button branchViewJijisaStudentButton;

    // -------****--------

    // constants used for click listner aasigning events and also used at reciever checking
    private static final String VIEW_ALL= "view-all-students";

    private static final String AAIJI_A= "aaiji-a-students";

    private static final String AAIJI_B= "aaiji-b-students";

    private static final String AAIJI_C= "aaiji-c-students";

    private static final String JIJISA= "jijisa-students";

    //---------------****---------

    private static final String STUDENTS = "students";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_view);

        branchViewAllStudentButton = (Button) findViewById(R.id.branch_view_all_students_button);
        // for viewing list of all students in hostel .
        // aaiji a + aaiji b + aaiji c + jijisa .

        branchViewAllStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentButtonClicked(VIEW_ALL);
                // for viewing all students we pass VIEW_ALL constant.
            }
        });


        branchViewAaijiA_StudentButton = (Button) findViewById(R.id.branch_view_aaiji_a_button);
        // for viewing list of  students in hostel .
        // aaiji a

        branchViewAaijiA_StudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentButtonClicked(AAIJI_A);
                // for viewing aaiji-a students we pass AAIJI_A constant.
            }
        });


        branchViewAaijiB_StudentButton = (Button) findViewById(R.id.branch_view_aaiji_b_button);
        // for viewing list of  students in hostel .
        // aaiji b

        branchViewAaijiB_StudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentButtonClicked(AAIJI_B);
                // for viewing aaiji-b students we pass AAIJI_B constant.
            }
        });


        branchViewAaijiC_StudentButton = (Button) findViewById(R.id.branch_view_aaiji_c_button);
        // for viewing list of  students in hostel .
        // aaiji c

        branchViewAaijiC_StudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentButtonClicked(AAIJI_C);
                // for viewing aaiji-c students we pass AAIJI_C constant.
            }
        });


        branchViewJijisaStudentButton = (Button) findViewById(R.id.branch_view_jijisa_button);
        // for viewing list of  students in hostel .
        // jijisa

        branchViewJijisaStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentButtonClicked(JIJISA);
                // for viewing aaiji-a students we pass AAIJI_A constant.
            }
        });
    }

    // this method is all thogetherly used for pasing intent to mainActivity
    // select button item resulting students .
    private void studentButtonClicked(String students) {

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra(STUDENTS , students);

        startActivity(intent);
    }
}
