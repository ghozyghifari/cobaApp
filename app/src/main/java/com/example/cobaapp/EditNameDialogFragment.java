package com.example.cobaapp;

import android.app.Dialog;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class EditNameDialogFragment extends DialogFragment {

    private EditText mEditText;


    static EditNameDialogFragment newInstance(){
        EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
        return editNameDialogFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance) {

        return inflater.inflate(R.layout.pop_up_test, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    /*@Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }*/
    /*@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){

        super.onViewCreated(view, savedInstanceState);
        Log.e("nizam", "onCreateView: " );
        mEditText = (EditText) view.findViewById(R.id.txt_inputData);

        *//*String title = getArguments().getString("title","Enter Data");
        getDialog().setTitle(title);*//*

        *//*mEditText.requestFocus();*//*
       *//* getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE
        );*//*
    }*/
}
