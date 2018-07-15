package com.heptware.android.aaijihostel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.heptware.android.aaijihostel.data.fakeData;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<fakeData> {

    public StudentAdapter(Context context , ArrayList<fakeData> fakeData){
        super(context , 0 , fakeData);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        fakeData currentStudent = getItem(position);
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.students_list_view , parent , false);
        }

        TextView textView = (TextView) listItemView.findViewById(R.id.textView_display);

        textView.setText(currentStudent.toString());

        return listItemView;
    }
}
