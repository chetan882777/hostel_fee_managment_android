package com.heptware.android.aaijihostel.data;

import java.util.ArrayList;

public class fakeData {

    // data used for loading list view with data for checking pourpose

    private String mStudentName;
    // holds student name

    private String mStudentClass;
    // hold student class

    private int mDueFee;
    // hold due fee of student

    private String mStudentSchool;
    // hold schools of student

    public fakeData(String studentName , String studentSchool, String studentClass, int dueFee){
        mStudentName = studentName;
        mStudentSchool = studentSchool;
        mStudentClass = studentClass;
        mDueFee = dueFee;
    }

    public static ArrayList<fakeData> getFakeData(){
        // loading up student data int arrarlist name varFakeData
        ArrayList<fakeData> varFakeData = new ArrayList<>();

        varFakeData.add(new fakeData("kunal","aims-international","9th",2001));
        varFakeData.add(new fakeData("kunal1","aims-international9","8th",2100));
        varFakeData.add(new fakeData("kunal2","aims-international8","7th",2200));
        varFakeData.add(new fakeData("kunal3","aims-international7","6th",2300));
        varFakeData.add(new fakeData("kunal4","aims-international6","5th",2400));
        varFakeData.add(new fakeData("kunal5","aims-international5","4th",2400));
        varFakeData.add(new fakeData("kunal6","aims-international4","3th",2500));
        varFakeData.add(new fakeData("kunal7","aims-international3","2th",2600));
        varFakeData.add(new fakeData("kunal8","aims-international2","1th",2700));
        varFakeData.add(new fakeData("kunal9","aims-international1","0th",2800));
        varFakeData.add(new fakeData("kunal0","aims-international0","10th",2900));
        varFakeData.add(new fakeData("kunal11","aims-international11","9th",2100));
        varFakeData.add(new fakeData("kunal12","aims-international12","8th",2200));
        varFakeData.add(new fakeData("kunal13","aims-international13","11th",2300));
        varFakeData.add(new fakeData("kunal14","aims-international14","14th",2400));
        varFakeData.add(new fakeData("kunal15","aims-international15","12th",2500));

        return  varFakeData;
        // returning arraylist varFakedata for further ussage.
    }



    // --- methods used fro getting values in adapter.
    public int getDueFee() {
        return mDueFee;
    }

    public String getStudentClass() {
        return mStudentClass;
    }

    public String getStudentSchool() {
        return mStudentSchool;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public String toString(){
        return mStudentName + "-"+ mStudentSchool + " -"+ mStudentClass+"-" + mDueFee;
    }
}
