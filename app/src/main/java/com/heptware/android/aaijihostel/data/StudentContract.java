package com.heptware.android.aaijihostel.data;

import android.provider.BaseColumns;

public class StudentContract {
    public StudentContract(){}

    public static final class StudentEntry implements BaseColumns{


        /** Name of database table for students */
        public final static String TABLE_NAME = "students";


        /**
         * Unique ID number for the students (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;


        /**
         * Name of the students.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_NAME ="name";


        /**
         * class of the students.
         * possible values {nursery , kg I , kg II , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_CLASS = "class";


        /**
         * class of the students.
         * possible values {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_AGE = "age";



        /**
         * last result of the students.
         * possible values {fail , grade D, grade C , grade B , grade A}
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_LAST_RESULT = "last_result";



        /**
         * hostel branch of the students.
         * possible values {AAiji a , aaiji b, aaiji c, jijisa }
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_HOSTEL_BRANCH = "hostel_branch";



        /**
         * Fee of the students.
         * possible values { 1500 , 1600 , 1700 ,.... , 2900 , 3000 , 15000 , 16000 , 17000 , ....... , 29000 , 30000}
         * here values from 1500 to 3000 are monthly charges and 15000 to 30000 are yearly charges
         *
         * Type: int
         */
        public final static String COLUMN_STUDENT_FEE = "fee";




        /**
         * Father of the student.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_FATHER = "father";



        /**
         * student's father occupation.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_FATHER_OCCUPATION = "father_occupation";


        /**
         * student's mother.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_Mother = "mother";



        /**
         * student's mother occupation.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_MOTHER_OCCUPATION = "mother_occupation";



        /**
         * student's school.
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_SCHOOL = "school";


        /**
         * student's phone number.
         * primary contact to contact with parent
         * if not in school then clg and if clg also not den work done by him /her after staying here
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_PHONE_1 = "phone_I";


        /**
         * student's phone number.
         * secondary contact of contact with parent
         * it can be empty
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_PHONE_2 = "phone_II";


        /**
         * student's phone number.
         * if students has mob so his/her number here else if any other trustworthy for  student
         * it can be empty
         *
         * Type: TEXT
         */
        public final static String COLUMN_STUDENT_PHONE_3 = "phone_III";


        /**
         * student's image.
         * will contain student image resource id
         *
         * Type: string / wiil be casted for usage
         */
        public final static String COLUMN_STUDENT_IMAGE = "image";


        /**
         * student's data unavailable.
         *
         * Type: string
         */
        public final static String STUDENT_DATA_UNAVAILABLE = "unavailable";


    }
}
